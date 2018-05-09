package com.training;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Insert X");
            int x = scanner.nextInt();
            System.out.println("Insert Y");
            int y = scanner.nextInt();
            System.out.println("Insert operation: +, -, *, /, ^ ");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println(Calculator.addNumbers(x, y));
                    break;
                case '-':
                    System.out.println(Calculator.substractNumbers(x, y));
                    break;
                case '*':
                    System.out.println(Calculator.multiplyNumbers(x, y));
                    break;
                case '/':
                    if (y == 0)
                        System.out.println("DIVISION BY ZERO !!!");
                    else
                        System.out.println(Calculator.divideNUmbers(x, y));
                    break;
                case '^':
                    System.out.println(Calculator.powerOfNumber(x, y));
                    break;
                case 'q':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operator !!!");
                    break;
            }
        }
    }
}
