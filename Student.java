// public class Student {
    
//         // Instance variables
//         private int id;
//         private String name;
//         private int age;
    
//         // Default constructor
//         public Student() {
//             // Default values
//             id = 0;
//             name = "Unknown";
//             age = 0;
//         }
    
//         // Parameterized constructor
//         public Student(int id, String name, int age) {
//             this.id = id;
//             this.name = name;
//             this.age = age;
//         }
    
//         // Method to display student details
//         public void displayDetails() {
//             System.out.println("Student ID: " + id);
//             System.out.println("Student Name: " + name);
//             System.out.println("Student Age: " + age);
//         }
    
//         // Main method for testing the Student class
//         public static void main(String[] args) {
//             // Creating student objects using default and parameterized constructors
//             Student student1 = new Student(); // Default constructor
//             Student student2 = new Student(1, "Alice", 20); // Parameterized constructor
    
//             // Displaying student details
//             System.out.println("Student 1 Details:");
//             student1.displayDetails();
//             System.out.println("\nStudent 2 Details:");
//             student2.displayDetails();
//         }
    
// }

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();

        // Create a Student object using the parameterized constructor
        Student student = new Student(id, name, age);

        // Displaying student details
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close(); // Close the scanner
    }
}
