package com.training;

import java.util.Random;

public class Main {

    private static SalesRepresentative[] salesRepresentatives;
    private static final int numberOfSalesman = 7;

    public static void main(String[] args) {

        initSalesmanList();
        printSalesmanList();

        salesRepresentatives = BubbleSort.sortSalesRepresentatives(salesRepresentatives);
        printSalesmanList();
    }

    private static void initSalesmanList()
    {
        salesRepresentatives = new SalesRepresentative[numberOfSalesman];
        Random intGenerator= new Random();
        for(int i=0; i< numberOfSalesman; i++)
        {
            salesRepresentatives[i] = new SalesRepresentative();
            salesRepresentatives[i].setName("Salesman" + (i+1));
            salesRepresentatives[i].setSalesNo(generateRandomInt(1,50));
            salesRepresentatives[i].setSaleQuota(generateRandomInt(1,50));
        }
    }

    private static void printSalesmanList()
    {
        System.out.println("##########################");
        for(int i=0; i< numberOfSalesman; i++)
        {
            System.out.println(salesRepresentatives[i]);
        }
        System.out.println();
    }

    private static int generateRandomInt(int min, int max)
    {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
