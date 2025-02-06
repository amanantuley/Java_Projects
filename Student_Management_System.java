import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    // Constructor
    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}

public class Student_Management_System {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    // Add a new student
    public static void addStudent() {
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        students.add(new Student(rollNo, name, age));
        System.out.println("Student added successfully!");
    }

    // Display all students
    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\nStudent List:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", Age: " + student.age);
        }
    }

    // Update student details
    public static void updateStudent() {
        System.out.print("Enter roll number of student to update: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Student student = findStudentByRollNo(rollNo);
        if (student != null) {
            System.out.print("Enter new name: ");
            student.name = scanner.nextLine();
            System.out.print("Enter new age: ");
            student.age = scanner.nextInt();
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Delete a student
    public static void deleteStudent() {
        System.out.print("Enter roll number of student to delete: ");
        int rollNo = scanner.nextInt();
        Student student = findStudentByRollNo(rollNo);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Find a student by roll number
    public static Student findStudentByRollNo(int rollNo) {
        for (Student student : students) {
            if (student.rollNo == rollNo) {
                return student;
            }
        }
        return null;
    }
}
