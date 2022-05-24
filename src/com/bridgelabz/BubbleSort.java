package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {
    int array[] = new int[5];

    public void getData() {
        System.out.println("enter 6 numbers for sorting...");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            array[i] = scanner.nextInt();
    }

    public void display() {
        for (int i = 0; i < 5; i++)
            System.out.println(array[i]);
    }

    public void bubbleSortCode() {
        int temp;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
