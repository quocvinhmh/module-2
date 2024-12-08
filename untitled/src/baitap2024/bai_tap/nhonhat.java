package baitap2024.bai_tap;

import java.util.Scanner;

public class nhonhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----Input Length----");
        int size = Integer.parseInt(in.nextLine());
        System.out.println("----Input Array----");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.nextLine());
        }
        System.out.println("----Array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is " + smallest);
    }
}