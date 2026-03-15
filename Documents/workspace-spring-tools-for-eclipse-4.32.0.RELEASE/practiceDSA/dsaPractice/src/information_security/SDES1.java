package information_security;

public class SDES1 {

    public static String k1 = "";
    public static String k2 = "";

    public static void generateKeys() {

        String orgKey="1001011101";
        int[] P10= {3,5,2,7,4,10,1,9,8,6};
        int[] P8= {6,3,7,4,8,5,10,9};

        String generatedKeys = permute10(orgKey,P10);

        String left=generatedKeys.substring(0,5);
        String right=generatedKeys.substring(5);

        String left_shift=shifting(left,1);
        String right_shift=shifting(right,1);

        String concat = left_shift + right_shift;
        k1 = permute8(concat,P8);

        String left2 = concat.substring(0,5);
        String right2 = concat.substring(5);

        String left_shift2 = shifting(left2,2);
        String right_shift2 = shifting(right2,2);

        String concat2 = left_shift2 + right_shift2;
        k2 = permute8(concat2,P8);
    }

    static String permute10(String orgkey,int[] P10){
        String res="";
        for(int i=0;i<10;i++) res += orgkey.charAt(P10[i]-1);
        return res;
    }

    static String permute8(String orgkey,int[] P8){
        String res="";
        for(int i=0;i<8;i++) res += orgkey.charAt(P8[i]-1);
        return res;
    }

    static String shifting(String s,int n){
        return s.substring(n)+s.substring(0,n);
    }
}
