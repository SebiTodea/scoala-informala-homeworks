package com.training;

public class BubbleSort {
    public static SalesRepresentative[] sortSalesRepresentatives(SalesRepresentative[] unsortedArray)
    {
        boolean swapped = false;
        int length = unsortedArray.length;
        SalesRepresentative temp;

        do {
            swapped = false;

            for (int i=0; i< length - 1; i++) {
                if (unsortedArray[i].getSalesRevenue() < unsortedArray[i+1].getSalesRevenue())
                {
                    temp = unsortedArray[i];
                    unsortedArray[i]=unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                    swapped = true;

                }
            }

        }
        while (swapped);

        return unsortedArray;
    }

}