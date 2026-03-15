package information_security;

import java.util.Scanner;

public class CEASER_CIPHER {

    public void encryption(String plaintext, String alphabet, int k) {
        String cipher = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
                int index = alphabet.indexOf(ch);
                int newIndex = (index + k) % 26;
                char newChar = alphabet.charAt(newIndex);
                cipher += newChar;
           
        }
        System.out.println("Cipher text: " + cipher);
    }

    public void decryption(String ciphertext, String alphabet, int k) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
       
                int index = alphabet.indexOf(ch);
                int newIndex = (index - k + 26) % 26; // ensures no negative index
                char newChar = alphabet.charAt(newIndex);
                plaintext += newChar;
           
        }
        System.out.println("Plain text: " + plaintext);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        CEASER_CIPHER cip = new CEASER_CIPHER();

        while (true) {
            System.out.println("\n=== CEASER CIPHER MENU ===");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            s.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter plaintext: ");
                    String plaintext = s.nextLine().toLowerCase();
                    System.out.print("Enter key (K): ");
                    int k = s.nextInt();
                    cip.encryption(plaintext, alphabet, k);
                    break;

                case 2:
                    System.out.print("Enter ciphertext: ");
                    String ciphertext = s.nextLine().toLowerCase();
                    System.out.print("Enter key (K): ");
                    int k2 = s.nextInt();
                    cip.decryption(ciphertext, alphabet, k2);
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
