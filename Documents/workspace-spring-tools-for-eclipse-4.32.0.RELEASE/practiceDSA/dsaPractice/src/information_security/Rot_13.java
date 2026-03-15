package information_security;

public class Rot_13 {

    public void encryption(String plaintext, String alphabet) {
        String cipher = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                int index = alphabet.indexOf(ch);
                int newindex = (index + 13) % 26;
                char newchar = alphabet.charAt(newindex);
                cipher += newchar;
            } else {
                cipher += ch; 
            }
        }
        System.out.println("Cipher text: " + cipher);
    }

    public void decryption(String ciphertext, String alphabet) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            if (Character.isLetter(ch)) {
                int index = alphabet.indexOf(ch);
                int newindex = (index - 13+26) % 26; // same shift for ROT13
                char newchar = alphabet.charAt(newindex);
                plaintext += newchar;
            } else {
                plaintext += ch;
            }
        }
        System.out.println("Plain text: " + plaintext);
    }

    public static void main(String[] args) {
        String plaintext = "nothren";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        Rot_13 rt = new Rot_13();

        System.out.println("=== ROT13 Encryption ===");
        rt.encryption(plaintext, alphabet);

        System.out.println("\n=== ROT13 Decryption ===");
        String ciphertext = "abguera"; // known ROT13 of "nothren"
        rt.decryption(ciphertext, alphabet);
    }
}
