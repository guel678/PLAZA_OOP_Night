package com.mycompany.miguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test case number: ");
        int testCaseNumber = scanner.nextInt();

        switch (testCaseNumber) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                Student student1 = new Student("Jemar Jude", "Maranga", 17);
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                Student student2 = new Student("Jemar Jude", "Maranga", 17);
                student2.increaseAge();
                System.out.println(student2);
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                Student student3 = new Student("Jose", "Cruz", 19);
                System.out.println(student3);
                break;
            default:
                System.out.println("Invalid test case number.");
        }

        scanner.close();
    }
}
