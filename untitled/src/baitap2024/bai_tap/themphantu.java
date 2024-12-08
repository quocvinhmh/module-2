package baitap2024.bai_tap;

import java.util.Scanner;

public class themphantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array= {10,32,3,2,4,0};
        int N = Array.length;
        System.out.println("số phần tử ban đầu: ");
        for (int k : Array){
            System.out.println(k);
        }
        System.out.println("nhập vị trí phần tử muốn thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số muốn thêm: ");
        int them = Integer.parseInt(sc.nextLine());
        int[] NewArray = new int[N + 1];
        for (int i = 0; i < Array.length; i++){
         NewArray[i]= Array[i];
        }
        NewArray[n] = them;
        for (int i = n; i < N; i++){
            NewArray[i +1]= Array[i];
        }
        System.out.print("Mảng sau khi chèn: ");
        for (int num : NewArray) {
            System.out.print(num + " ");
        }
    }
}
