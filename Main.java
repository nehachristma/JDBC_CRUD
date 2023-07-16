package myPackage;

import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        student st = new student();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Create database");
            System.out.println("2. Create table");
            System.out.println("3. Create data");
            System.out.println("4. Read data");
            System.out.println("5. Update data");
            System.out.println("6. Delete data");
            System.out.println("0. Exit");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    st.createDatabase();
                    break;
                case 2:
                    st.createTable();
                    break;
                case 3:
                    st.createData();
                    break;
                case 4:
                    st.readData();
                    break;
                case 5:
                    st.updateData();
                    break;
                case 6:
                    st.deleteData();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
