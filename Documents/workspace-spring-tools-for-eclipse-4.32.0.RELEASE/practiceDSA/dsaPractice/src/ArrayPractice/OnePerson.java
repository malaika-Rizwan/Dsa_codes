package ArrayPractice;

import java.util.Scanner;

public class OnePerson {
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
        OnePerson p = new OnePerson();
        p.input();
        p.display();
    }
}
