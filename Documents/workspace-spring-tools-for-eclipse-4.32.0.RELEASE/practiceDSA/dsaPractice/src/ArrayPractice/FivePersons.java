package ArrayPractice;

import java.util.Scanner;

public class FivePersons {
    Scanner s = new Scanner(System.in);
    String name, gender, country;
    int age;

    public void input() {
        System.out.println("What's your name?");
        name = s.nextLine();

        System.out.println("What's your age?");
        age = s.nextInt();
        s.nextLine(); // consume leftover newline

        System.out.println("What's your gender?");
        gender = s.nextLine();

        System.out.println("What's your country?");
        country = s.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name + "\tAge: " + age + "\tGender: " + gender + "\tCountry: " + country);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many persons do you want to store? ");
        int n = s.nextInt();
        s.nextLine(); // consume leftover newline

        FivePersons[] persons = new FivePersons[n];

        // input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            persons[i] = new FivePersons();
            persons[i].input();
        }

        // display loop
        System.out.println("\n--- Displaying All Persons ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].display();
        }

        s.close();
    }
}
