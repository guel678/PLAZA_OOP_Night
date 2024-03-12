package com.migilplaza;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    private int health;
    private int damage;
    private int shield;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase;

        System.out.print("Enter test case number: ");
        testCase = scanner.nextInt();

        Character character = new Character(100, 20, 5);
        Swordsman swordsman = new Swordsman();
        Paladin paladin = new Paladin();

        switch (testCase) {
            case 1:
                System.out.println("Testing Character Private Fields");
                testFieldPrivacy(character);
                break;

            case 2:
                System.out.println("Testing Character class getters");
                System.out.println("Character - Health: " + character.getHealth());
                System.out.println("Character - Damage: " + character.getDamage());
                System.out.println("Character - Shield: " + character.getShield());
                break;

            case 3:
                System.out.println("Testing Swordsman class getters");
                System.out.println("Swordsman - Health: " + swordsman.getHealth());
                System.out.println("Swordsman - Damage: " + swordsman.getDamage());
                System.out.println("Swordsman - Shield: " + swordsman.getShield());
                break;

            case 4:
                System.out.println("Testing Paladin Private Fields");
                testFieldPrivacy(paladin);
                break;

            case 5:
                System.out.println("Testing Paladin class getters");
                System.out.println("Paladin - Health: " + paladin.getHealth());
                System.out.println("Paladin - Damage: " + paladin.getDamage());
                System.out.println("Paladin - Shield: " + paladin.getShield());
                break;

            case 6:
                System.out.println("Testing damage received");
                character.receiveDamage(15);
                System.out.println("Character after receiving 15 damage - Health: " + character.getHealth());

                swordsman.receiveDamage(30);
                System.out.println("Swordsman after receiving 30 damage - Health: " + swordsman.getHealth());

                paladin.receiveDamage(40);
                System.out.println("Paladin after receiving 40 damage - Health: " + paladin.getHealth());
                break;

            case 7:
                System.out.println("Testing resurrection for Paladin");
                paladin.receiveDamage(40);
                System.out.println("Paladin after receiving 40 damage - Health: " + paladin.getHealth());
                paladin.resurrect();
                System.out.println("Paladin after resurrecting - Health: " + paladin.getHealth());
                paladin.resurrect(); // Attempt to resurrect again
                break;

            case 8:
                System.out.println("Testing if Swordsman is a child of Character");
                if (swordsman instanceof Character) {
                    System.out.println("Swordsman is a child of Character");
                } else {
                    System.out.println("Swordsman is not a child of Character");
                }

                System.out.println();
                break;

            case 9:
                System.out.println("Testing if Paladin is a child of Character");
                if (paladin instanceof Character) {
                    System.out.println("Paladin is a child of Character");
                } else {
                    System.out.println("Paladin is not a child of Character");
                }
                break;

            default:
                System.out.println("Invalid test case number.");
                break;
        }

        scanner.close();
    }

    public static void testFieldPrivacy(Character character) {
        Class<?> clazz = character.getClass();
        java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        boolean allFieldsPrivate = true;

        for (java.lang.reflect.Field field : fields) {
            if (!java.lang.reflect.Modifier.isPrivate(field.getModifiers())) {
                allFieldsPrivate = false;
                System.out.println("Field '" + field.getName() + "' is not private");
            }
        }

        if (allFieldsPrivate) {
            System.out.println("All fields are private");
        } else {
            System.out.println("Not all fields are private");
        }
    }

}