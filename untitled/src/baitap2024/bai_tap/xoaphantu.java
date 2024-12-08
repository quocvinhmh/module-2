package baitap2024.bai_tap;


import java.util.Scanner;

public class xoaphantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x ={10,3,2,3,32,4,2,0};
        System.out.println("mảng ban đầu: ");
        for (int hieu: x){
            System.out.println(hieu);
        }
        System.out.println("nhập mảng muốn xóa: ");
        int xoa = Integer.parseInt(sc.nextLine());
        int in = 0;
        int count = 0;
        int[] New = new int[x.length - 1];
        for (int k: x){
            if (k != xoa){
                New[in++] = k;
                     count++;
            }
        }
        if (count < x.length){
            for (int j: New){
                System.out.println(j+ " ");
            }
        }else {
            System.out.println("Không tìm thấy phần tử");
        }
    }
}
