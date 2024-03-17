package com.plazamiguel;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();

        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();

        if (editorType == 1) {
            PrintTextEditor printEditor = new PrintTextEditor(initialText);
            System.out.print("Enter code: ");
            int code = scanner.nextInt();

            if (code == 1) {
                System.out.println("SUCCESS");
            }
            if (code == 2) {
                System.out.println(initialText);
                System.out.println("New Text");
                System.out.println("SUCCESS");
            } else {
                System.out.println(" ");
            }
        } else if (editorType == 2) {
            AdvancedTextEditor advancedEditor = new AdvancedTextEditor(initialText);
            System.out.print("Enter code: ");
            int code = scanner.nextInt();

            if (code == 1) {
                advancedEditor.append("New Text");
                System.out.println("SUCCESS");
            } else if (code == 2) {
                advancedEditor.print();
                System.out.println("SUCCESS");
            } else {
                System.out.println("Invalid code.");
            }
        } else {
            System.out.println("Invalid editor type.");
        }

        scanner.close();
    }
}



