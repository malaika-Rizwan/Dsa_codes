package paperPractice;

public class StudentData {
private int rollnumber ;
private String name;
private int age; 
private double cgpa;
private String department;

public StudentData(String name, int rollNumber, int age, String department, double cgpa) {
    this.name = name;
    this.rollnumber = rollNumber;
    this.age = age;
    this.department = department;
    this.cgpa = cgpa;
}

public String getName() {return name;}
public String getdepartment() {return department;}
public int getrollnumber() {return rollnumber;}
public int getage() {return age;}
public Double getcgpa() {return cgpa;}

public void setName(String name) { this.name = name; }
public void setAge(int age) { this.age = age; }
public void setDepartment(String department) { this.department = department; }
public void setCgpa(double cgpa) { this.cgpa = cgpa; }

public void display() {
    System.out.println("Roll No: " + rollnumber + 
                       ", Name: " + name + 
                       ", Age: " + age + 
                       ", Dept: " + department + 
                       ", CGPA: " + cgpa);
}

}
