package com.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the month number");
            int monthNo = scanner.nextInt();
            switch (monthNo) {
                case 1:
                    System.out.println("31 days in January");
                    break;
                case 2:
                    System.out.println("Enter year");
                    int year = scanner.nextInt();
                    if(year % 4 == 0 && year % 100 != 0)
                        System.out.println("29 days in February");
                    else
                        System.out.println("28 days in February");
                    break;
                case 3:
                    System.out.println("31 days in March");
                    break;
                case 4:
                    System.out.println("30 days in April");
                    break;
                case 5:
                    System.out.println("31 days in May");
                    break;
                case 6:
                    System.out.println("30 days in June");
                    break;
                case 7:
                    System.out.println("31 days in July");
                    break;
                case 8:
                    System.out.println("31 days in August");
                    break;
                case 9:
                    System.out.println("30 days in September");
                    break;
                case 10:
                    System.out.println("31 days in October");
                    break;
                case 11:
                    System.out.println("30 days in November");
                    break;
                case 12:
                    System.out.println("31 days in December");
                    break;
                case -1:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid month no !!!");
                    break;
            }
        }
    }
}
