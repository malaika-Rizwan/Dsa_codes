package ArrayPractice;

import java.util.Scanner;

public class Student {
	
	Scanner sc=new Scanner(System.in);
	private String name,department;
	private int rollNumber, age;
	private double cgpa;
	
	public Student(String name, int rollNumber, int age, String department, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }
	
	
public String getName() {return name;}
public String getdepartment() {return department;}
public int getrollNumber() {return rollNumber;}
public int getage() {return age;}
public Double getcgpa() {return cgpa;}

public void setName(String name) { this.name = name; }
public void setAge(int age) { this.age = age; }
public void setDepartment(String department) { this.department = department; }
public void setCgpa(double cgpa) { this.cgpa = cgpa; }

public void display() {
    System.out.println("Roll No: " + rollNumber + 
                       ", Name: " + name + 
                       ", Age: " + age + 
                       ", Dept: " + department + 
                       ", CGPA: " + cgpa);
}

	

}
