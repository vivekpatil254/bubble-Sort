package com.bridgelabz;

public class BubbleSortMain {

    public static void main(String[] args) {
        BubbleSort sort=new BubbleSort();
        sort.getData();
        System.out.println("Before Sorting numbers are : ");
        sort.display();
        sort.bubbleSortCode();
        System.out.println("after Sorting numbers are : ");
        sort.display();
    }
}
