package information_security;

import java.util.Scanner;

public class Monoalphabatic1 {
    static Scanner s = new Scanner(System.in);

    static String plaintext = "abcdefghijklmnopqrstuvwxyz0123456789";
    static String ciphertext = "9876543210xwvutsrqponmlkjihgfedcba";

    public String encrypt(String ptext) {
        String chiper = "";

        for (int i = 0; i < ptext.length(); i++) {
            char c = ptext.charAt(i);

            

            int index = plaintext.indexOf(c);
        
                char c2 = ciphertext.charAt(index);
                chiper = chiper + c2;
           
        }

        return chiper;
    }
    public String decrypt(String ctext) {
        String plane = "";

        for (int i = 0; i < ctext.length(); i++) {
            char c = ctext.charAt(i);

            

            int index = plaintext.indexOf(c);
         
                char c2 = ciphertext.charAt(index);
                plane = plane + c2;
           
        }

        return plane;
    }

    public static void main(String[] args) {
        Monoalphabatic1 m1 = new Monoalphabatic1();

        System.out.print("Enter plain text: ");
        String ptext = s.nextLine();

        String encrypted = m1.encrypt(ptext);
        System.out.println("Encrypted text: " + encrypted);
        
        System.out.print("Enter cypher text: ");
        String ctext = s.nextLine();

        String decrypted = m1.encrypt(ctext);
        System.out.println("Encrypted text: " + decrypted);
    }
}
