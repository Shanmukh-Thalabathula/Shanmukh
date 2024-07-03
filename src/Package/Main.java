package Package;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void setArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter your data (int) : ");
            intArray[i] = scanner.nextInt();
        }
        scanner.nextLine();  // Consume the newline character
    }

    static void getArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Your data at index %d : %d%n", i, intArray[i]);
        }
    }

    static void setArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("Enter your data (String) : ");
            stringArray[i] = scanner.nextLine();
        }
    }

    static void getArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("Your data at index %d : %s%n", i, stringArray[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("1: int array");
        System.out.println("2: String array");
        System.out.print("Choose an option : ");
        
        int x = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (x == 1) {
            int[] intArray = new int[size];
            setArray(intArray);
            getArray(intArray);
        } else if (x == 2) {
            String[] stringArray = new String[size];
            setArray(stringArray);
            getArray(stringArray);
        } else {
            System.out.println("Invalid option");
        }
    }
}
