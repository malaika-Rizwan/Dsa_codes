package information_security;

import java.util.Scanner;

public class Polyalphabatic {

    // Encryption
    public void encryption(String plaintext, String key, String alphabet) {
        StringBuilder cipher = new StringBuilder();
        key = key.toLowerCase();

        for (int i = 0; i < plaintext.length(); i++) {
            char pChar = plaintext.charAt(i);

            char kChar = key.charAt(i % key.length());
            int pIndex = alphabet.indexOf(pChar);
            int kIndex = alphabet.indexOf(kChar);

            int newIndex = (pIndex + kIndex) % alphabet.length();
            cipher.append(alphabet.charAt(newIndex));
        }

        System.out.println("Cipher text: " + cipher);
    }

    // Decryption
    public void decryption(String ciphertext, String key, String alphabet) {
        StringBuilder plaintext = new StringBuilder();
        key = key.toLowerCase();

        for (int i = 0; i < ciphertext.length(); i++) {
            char cChar = ciphertext.charAt(i);

            char kChar = key.charAt(i % key.length());
            int cIndex = alphabet.indexOf(cChar);
            int kIndex = alphabet.indexOf(kChar);

            int newIndex = (cIndex - kIndex + alphabet.length()) % alphabet.length();
            plaintext.append(alphabet.charAt(newIndex));
        }

        System.out.println("Plain text: " + plaintext);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";

        Polyalphabatic poly = new Polyalphabatic();

        while (true) {
            System.out.println("\n--- POLYALPHABETIC CIPHER MENU ---");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter plaintext: ");
                    String plaintext = s.nextLine().toLowerCase();

                    System.out.print("Enter key (word): ");
                    String keyEnc = s.nextLine();

                    poly.encryption(plaintext, keyEnc, alphabet);
                    break;

                case 2:
                    System.out.print("Enter ciphertext: ");
                    String ciphertext = s.nextLine().toLowerCase();

                    System.out.print("Enter key (word): ");
                    String keyDec = s.nextLine();

                    poly.decryption(ciphertext, keyDec, alphabet);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
	