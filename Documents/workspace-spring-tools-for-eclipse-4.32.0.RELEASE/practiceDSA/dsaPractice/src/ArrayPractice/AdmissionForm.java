package ArrayPractice;

public class AdmissionForm {
    private Student[] students;
    private int size;
    private int capacity;

    // Constructor
    public AdmissionForm() {
        capacity = 2;
        size = 0;
        students = new Student[capacity];
    }

    // 🔹 Add student at the end
    public void addStudent(Student s) {
        if (size == capacity) resize(capacity * 2);
        students[size++] = s;
    }

    // 🔹 Add student at a specific position
    public void addStudentAt(int index, Student s) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (size == capacity) resize(capacity * 2);

        for (int i = size; i > index; i--) {
            students[i] = students[i - 1];
        }
        students[index] = s;
        size++;
    }

    // 🔹 Update student by roll number
    public void updateStudent(int rollNumber, String name, int age, String dept, double cgpa) {
        for (int i = 0; i < size; i++) {
            if (students[i].getrollNumber() == rollNumber) {
                students[i].setName(name);
                students[i].setAge(age);
                students[i].setDepartment(dept);
                students[i].setCgpa(cgpa);
                System.out.println(" Student updated successfully!");
                return;
            }
        }
        System.out.println(" Student with Roll No " + rollNumber + " not found!");
    }

    // 🔹 Delete student by roll number
    public void deleteStudentByRoll(int rollNumber) {
        for (int i = 0; i < size; i++) {
            if (students[i].getrollNumber() == rollNumber) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                size--;
                if (size > 0 && size <= capacity / 4) resize(capacity / 2);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // 🔹 Delete student by index
    public void deleteStudentByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        size--;
        if (size > 0 && size <= capacity / 4) resize(capacity / 2);
        System.out.println("✅ Student deleted successfully!");
    }

    // 🔹 View all students
    public void viewStudents() {
        if (size == 0) {
            System.out.println("Form is empty!");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (int i = 0; i < size; i++) {
            students[i].display();
        }
        System.out.println("(Total Students: " + size + ", Capacity: " + capacity + ")");
    }

    // 🔹 Resizing function
    private void resize(int newCapacity) {
        Student[] newArray = new Student[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = students[i];
        }
        students = newArray;
        capacity = newCapacity;
    }
}
