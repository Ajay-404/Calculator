package io.pragra;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("   MY CALCULATOR");
        System.out.println("====================");

        int choice = -1;
        int exit = -1;
        int paramNum = 0;
        Scanner scanner = new Scanner(System.in);

        while(choice < 0 || exit != 0) {
            System.out.println("Please choose the operator from below menu:");
            System.out.println("0 - Exit");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    exit = 0;
                    System.out.println("Good-Bye");
                    break;
                case 1:
                    while (paramNum < 1) {
                        System.out.print("Please indicate how many numbers to Add (>1): ");
                        paramNum = scanner.nextInt();
                    }
                    int array[] = new int[paramNum];

                    for (int i = 0; i < paramNum; i++) {
                        System.out.print("Please enters a number: ");
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("The result is: " + sum(array));
                    break;
                case 2:
                    while (paramNum < 1) {
                        System.out.print("Please indicate how many numbers to Subtract (>1): ");
                        paramNum = scanner.nextInt();
                    }
                    int arraySub[] = new int[paramNum];

                    for (int i = 0; i < paramNum; i++) {
                        System.out.print("Please enters a number: ");
                        arraySub[i] = scanner.nextInt();
                    }
                    System.out.println("The result is: " + sub(arraySub));
                    break;
                case 3:
                    while (paramNum < 1) {
                        System.out.print("Please indicate how many numbers to Multiply (>1): ");
                        paramNum = scanner.nextInt();
                    }
                    int arrayMulti[] = new int[paramNum];

                    for (int i = 0; i < paramNum; i++) {
                        System.out.print("Please enters a number: ");
                        arrayMulti[i] = scanner.nextInt();
                    }
                    System.out.println("The result is: " + multiply(arrayMulti));
                    break;
                case 4:
                    while (paramNum < 1) {
                        System.out.print("Please indicate how many numbers to Divide (>1): ");
                        paramNum = scanner.nextInt();
                    }
                    int arrayDivide[] = new int[paramNum];

                    for (int i = 0; i < paramNum; i++) {
                        System.out.print("Please enters a number: ");
                        arrayDivide[i] = scanner.nextInt();
                    }
                    System.out.println("The result is: " + divide(arrayDivide));
                    break;
                default:
                    break;
            }
        }
    }

    public static int sum(int ...n)
    {
        int sum = 0;
        for (int i=0; i< n.length; i++)
        {
            sum += n[i];
        }
        return sum;
    }
    public static int sub(int ...n)
    {
        int sub = n[0];
        for (int i=0; i< n.length-1; i++)
        {
            sub -= n[i+1];
        }
        return sub;
    }
    public static int multiply(int ...n)
    {
        int multiply = n[0];
        for (int i=0; i< n.length-1; i++)
        {
            multiply = multiply*n[i+1];
        }
        return multiply;
    }
    public static double divide(int ...n)
    {
        double divide = n[0];
        for (int i=0; i< n.length-1; i++)
        {
            divide = divide/n[i+1];
        }
        return divide;
    }
}
