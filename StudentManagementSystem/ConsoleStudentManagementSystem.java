package StudentManagementSystem;
import java.util.List;
import java.util.Scanner;

public class ConsoleStudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(name, rollNumber, grade);
                    studentManagementSystem.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter roll number of the student to remove: ");
                    int removeRollNumber = scanner.nextInt();
                    studentManagementSystem.removeStudent(removeRollNumber);
                    System.out.println("Student removed successfully!");
                    break;

                case 3:
                    System.out.print("Enter roll number of the student to search: ");
                    int searchRollNumber = scanner.nextInt();
                    Student foundStudent = studentManagementSystem.searchStudent(searchRollNumber);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    List<Student> allStudents = studentManagementSystem.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("All Students:");
                        for (Student student : allStudents) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            scanner.close();
            }
        }
    }
}
