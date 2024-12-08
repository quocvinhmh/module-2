package baitap2024.bai_tap;

import java.util.Scanner;

public class mang2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("số mảng: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("độ dài mảng: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("----Input Value----");
        int[][] chieu = new int[a][b];
        for (int i = 0; i < chieu.length; i++) {
            for (int j = 0; j < chieu[i].length; j++) {
                chieu[i][j] = Integer.parseInt(sc.nextLine());
            }
           System.out.println("----Data----");
        }
        int max = chieu[0][0];
        for (int i = 0; i < chieu.length; i++) {
            for (int j = 0; j < chieu[i].length; j++) {
                if (chieu[i][j] > max) {
                    max = chieu[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
