package information_security;

public class Monoalphabetic {

    static String plain = "abcdefghijklmnopqrstuvwxyz";
    static String cipher = "zyxwvutsrqponmlkjihgfedcba";

    // Encrypt (pure logic)
    public void encryption(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            int index = plain.indexOf(text.charAt(i));
            result += cipher.charAt(index);
        }

        System.out.println("Cipher: " + result);
    }

    // Decrypt (pure logic)
    public void decryption(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            int index = cipher.indexOf(text.charAt(i));
            result += plain.charAt(index);
        }

        System.out.println("Plain: " + result);
    }

    public static void main(String[] args) {
        Monoalphabetic m = new Monoalphabetic();

        m.encryption("hello");   // → svool
        m.decryption("svool");   // → hello
    }
}
