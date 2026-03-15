package information_security;

import java.util.*;

public class PlayfairCipher {

    public static char[][] generateMatrix(String key) {
        key = key.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch == 'J') continue;
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        
        char[][] matrix = new char[5][5];
        int index = 0;
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                matrix[r][c] = result.charAt(index++);
            }
        }

        return matrix;
    }

    public static int[] findPosition(char[][] matrix, char ch) {
        if (ch == 'J') ch = 'I';
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (matrix[r][c] == ch) {
                    return new int[]{r, c};
                }
            }
        }
        return null;
    }

    
    public static String prepareText(String text) {
        text = text.toUpperCase().replaceAll("[^A-Z]", "").replace("J", "I");
        StringBuilder prepared = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            prepared.append(text.charAt(i));
            if (i + 1 < text.length()) {
                if (text.charAt(i) == text.charAt(i + 1)) {
                    prepared.append('X');
                }
            }
        }

        if (prepared.length() % 2 != 0) {
            prepared.append('X');
        }

        return prepared.toString();
    }

  
    public static String encrypt(String text, char[][] matrix) {
        StringBuilder encrypted = new StringBuilder();
        text = prepareText(text);

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(matrix, a);
            int[] posB = findPosition(matrix, b);

            
            
            
            //row comparing
            if (posA[0] == posB[0]) { 
                encrypted.append(matrix[posA[0]][(posA[1] + 1) % 5]);
                encrypted.append(matrix[posB[0]][(posB[1] + 1) % 5]);
            } else if (posA[1] == posB[1]) { 
                encrypted.append(matrix[(posA[0] + 1) % 5][posA[1]]);
                encrypted.append(matrix[(posB[0] + 1) % 5][posB[1]]);
            } else { 
                encrypted.append(matrix[posA[0]][posB[1]]);
                encrypted.append(matrix[posB[0]][posA[1]]);
            }
        }

        return encrypted.toString();
    }

    
    public static String decrypt(String text, char[][] matrix) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            int[] posA = findPosition(matrix, a);
            int[] posB = findPosition(matrix, b);

            if (posA[0] == posB[0]) { 
                decrypted.append(matrix[posA[0]][(posA[1] + 4) % 5]);
                decrypted.append(matrix[posB[0]][(posB[1] + 4) % 5]);
            } else if (posA[1] == posB[1]) { 
                decrypted.append(matrix[(posA[0] + 4) % 5][posA[1]]);
                decrypted.append(matrix[(posB[0] + 4) % 5][posB[1]]);
            } else {
                decrypted.append(matrix[posA[0]][posB[1]]);
                decrypted.append(matrix[posB[0]][posA[1]]);
            }
        }

        return decrypted.toString();
    }

    
    public static void displayMatrix(char[][] matrix) {
        System.out.println("Playfair Cipher Matrix:");
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = sc.nextLine();

        char[][] matrix = generateMatrix(key);
        displayMatrix(matrix);

        System.out.print("\nEnter plaintext: ");
        String plaintext = sc.nextLine();

        String ciphertext = encrypt(plaintext, matrix);
        System.out.println("\nEncrypted Text: " + ciphertext);

        String plaintext = decrypt(ciphertext, matrix);
        System.out.println("Decrypted Text: " + decrypted);
    }
}
