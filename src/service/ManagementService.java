package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import model.Teacher;
import model.Course;

public class ManagementService {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();

    static boolean studentIdExists(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return true;
            }
        }
        return false;
    }

    static boolean teacherIdExists(int id) {
        for (Teacher t : teachers) {
            if (t.id == id) {
                return true;
            }
        }
        return false;
    }

    static boolean courseIdExists(int id) {
        for (Course c : courses) {
            if (c.id == id) {
                return true;
            }
        }
        return false;
    }

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();
        if (studentIdExists(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Department: ");
        String department = input.nextLine();
        students.add(new Student(id, name, department));
        System.out.println("Student added successfully!");
    }

    public static void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }

        for (Student s : students) {
            System.out.println("----------------------");
            System.out.println("Student ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Department: " + s.department);
        }
    }

    public static void addTeacher() {
        System.out.print("Enter Teacher ID: ");
        int id = input.nextInt();
        input.nextLine();
        if (teacherIdExists(id)) {
            System.out.println("Teacher ID already exists!");
            return;
        }

        System.out.print("Enter Teacher Name: ");
        String name = input.nextLine();
        System.out.print("Enter Subject: ");
        String subject = input.nextLine();
        teachers.add(new Teacher(id, name, subject));
        System.out.println("Teacher added successfully!");
    }

    public static void showTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers added yet.");
            return;
        }

        for (Teacher t : teachers) {
            System.out.println("----------------------");
            System.out.println("Teacher ID: " + t.id);
            System.out.println("Name: " + t.name);
            System.out.println("Subject: " + t.subject);
        }
    }

    public static void addCourse() {
        System.out.print("Enter Course ID: ");
        int id = input.nextInt();
        input.nextLine();
        if (courseIdExists(id)) {
            System.out.println("Course ID already exists!");
            return;
        }

        System.out.print("Enter Course Name: ");
        String name = input.nextLine();
        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();
        courses.add(new Course(id, name, teacherName));
        System.out.println("Course added successfully!");
    }

    public static void showCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses added yet.");
            return;
        }

        for (Course c : courses) {
            System.out.println("----------------------");
            System.out.println("Course ID: " + c.id);
            System.out.println("Course Name: " + c.name);
            System.out.println("Teacher: " + c.teacherName);
        }
    }

    public static void search() {
        while (true) {
            System.out.println("\n===== Search =====");
            System.out.println("1. Search Student");
            System.out.println("2. Search Teacher");
            System.out.println("3. Search Course");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            if (choice == 4) {
                return;
            }

            System.out.print("Enter ID: ");
            int id = input.nextInt();

            if (choice == 1) {
                boolean found = false;
                for (Student s : students) {
                    if (s.id == id) {
                        System.out.println("----------------------");
                        System.out.println("Student ID: " + s.id);
                        System.out.println("Name: " + s.name);
                        System.out.println("Department: " + s.department);
                        System.out.println("----------------------");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found!");
                }
            } else if (choice == 2) {
                boolean found = false;
                for (Teacher t : teachers) {
                    if (t.id == id) {
                        System.out.println("----------------------");
                        System.out.println("Teacher ID: " + t.id);
                        System.out.println("Name: " + t.name);
                        System.out.println("Subject: " + t.subject);
                        System.out.println("----------------------");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Teacher not found!");
                }
            } else if (choice == 3) {
                boolean found = false;
                for (Course c : courses) {
                    if (c.id == id) {
                        System.out.println("----------------------");
                        System.out.println("Course ID: " + c.id);
                        System.out.println("Course Name: " + c.name);
                        System.out.println("Teacher: " + c.teacherName);
                        System.out.println("----------------------");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Course not found!");
                }
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
