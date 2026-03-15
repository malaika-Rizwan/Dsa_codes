package information_security;

public class SDES {

    static String Initialpermute(String text, int[] p) {
        String result = "";
        for (int i = 0; i < p.length; i++)
            result += text.charAt(p[i] - 1);
        return result;
    }

    static String xor(String a, String b){
        String r="";
        for(int i=0;i<a.length();i++)
            r += (a.charAt(i)==b.charAt(i)) ? "0" : "1";
        return r;
    }
    static String x_Boxing(String input8, int[][] s0_box, int[][] s1_box) {
        // input8 must be 8 bits string
        String left4 = input8.substring(0,4);
        String right4 = input8.substring(4);

        // Calculate row and column for s0
        int row_s0 = Integer.parseInt("" + left4.charAt(0) + left4.charAt(3), 2);
        int col_s0 = Integer.parseInt("" + left4.charAt(1) + left4.charAt(2), 2);

        int val_s0 = s0_box[row_s0][col_s0];

        // Calculate row and column for s1
        int row_s1 = Integer.parseInt("" + right4.charAt(0) + right4.charAt(3), 2);
        int col_s1 = Integer.parseInt("" + right4.charAt(1) + right4.charAt(2), 2);

        int val_s1 = s1_box[row_s1][col_s1];

        // Convert val_s0 and val_s1 to 2-bit binary strings
        String bin_s0 = String.format("%2s", Integer.toBinaryString(val_s0)).replace(' ', '0');
        String bin_s1 = String.format("%2s", Integer.toBinaryString(val_s1)).replace(' ', '0');

        // Concatenate and return 4-bit output
        return bin_s0 + bin_s1;
    }


    static void Encryption(String plaintext, int[] iP, int[] EP) {

        // get keys from SDES1
        SDES1.generateKeys();
        String K1 = SDES1.k1;
        System.out.println("K1 from SDES1 = " + K1);

        String permut8 = Initialpermute(plaintext, iP);
        String left0 = permut8.substring(0,4);
        String right0 = permut8.substring(4);

        System.out.println("After IP = " + permut8);
        System.out.println("L0 = " + left0);
        System.out.println("R0 = " + right0);

        String expandedRight = Initialpermute(right0, EP);
        System.out.println("After EP(R0) = " + expandedRight);

        String xorResult = xor(expandedRight, K1);
        System.out.println("After XOR with K1 = " + xorResult);

        String sBoxOutput = x_Boxing(xorResult, s0_box, s1_box);
        System.out.println("After S-Boxes = " + sBoxOutput);

    }

    public static void main(String[] args) {
        String plaintext = "10110100";
        int[] ip = {2,6,3,1,4,8,5,7};
        int[] EP = {4,1,2,3,2,3,4,1};
        
        int[][] s0_box= {{1,0,3,2},{3,2,1,0},{0,2,1,3},{3,1,3,2}};
        int[][] s1_box= {{0,1,2,3},{2,0,1,3},{3,0,1,0},{2,1,0,3}};
        

        Encryption(plaintext, ip, EP);
    }
}
