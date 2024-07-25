// Main.java
package database;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your choice: 1. Insert Data 2. Update Name 3. Update Email 4. Delete Data 5. Read Data 6. Exit");
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Roll no:");
                        int rollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter email:");
                        String email = scanner.nextLine();
                        Student stu = new Student(rollNo, name, email);
                        StudentDBMS.insertData(stu);
                        break;
                    case 2:
                        System.out.println("Enter the Roll no to update:");
                        rollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the new Name:");
                        name = scanner.nextLine();
                        StudentDBMS.updateName(rollNo, name);
                        break;
                    case 3:
                        System.out.println("Enter the Roll no to update:");
                        rollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter the new Email:");
                        email = scanner.nextLine();
                        StudentDBMS.updateEmail(rollNo, email);
                        break;
                    case 4:
                        System.out.println("Enter the Roll no to delete:");
                        rollNo = scanner.nextInt();
                        StudentDBMS.deleteData(rollNo);
                        break;
                    case 5:
                        StudentDBMS.readData();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
