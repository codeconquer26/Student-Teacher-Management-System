package main;

import java.util.Scanner;
import service.ManagementService;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Add Teacher");
            System.out.println("4. Show Teachers");
            System.out.println("5. Add Course");
            System.out.println("6. Show Courses");
            System.out.println("7. Search");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    ManagementService.addStudent();
                    break;
                case 2:
                    ManagementService.showStudents();
                    break;
                case 3:
                    ManagementService.addTeacher();
                    break;
                case 4:
                    ManagementService.showTeachers();
                    break;
                case 5:
                    ManagementService.addCourse();
                    break;
                case 6:
                    ManagementService.showCourses();
                    break;
                case 7:
                    ManagementService.search();
                    break;
                case 8:
                    System.out.println("Program ended.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
