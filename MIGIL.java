package com.mycompany.miguel;


import java.util.Scanner;

public class MIGIL{
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Enter the message:");

        String message = scanner.nextLine();

        boolean foundMisplacedCapital = false;

        for (int i = 1; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i - 1))
                    && Character.isLowerCase(message.charAt(i - 1)) && Character.isUpperCase(message.charAt(i)))
            {
                foundMisplacedCapital = true;
                break;
            }
        }
        System.out.println(foundMisplacedCapital ? "JEJE!" : "uWu");
        scanner.close();
    }
}