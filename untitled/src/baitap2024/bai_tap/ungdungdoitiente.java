package baitap2024.bai_tap;

import java.util.Scanner;

public class ungdungdoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 đổi từ VND sang USD: ");
        System.out.println("2 đổi từ USD sang VND ");
        int choi = sc.nextInt();
        if (choi == 1) {
            System.out.println("Nhập số tiền: ");
            int VND = sc.nextInt();
            double doi = VND * 25.3;
            System.out.println("1 đổi từ USD sang VND: " + doi + " vnd");
        }else if (choi == 2) {
            System.out.println("Nhập số tiền: ");
            int USD = sc.nextInt();
            double doi = USD / 25.3;
            System.out.println("2 đổi từ USD sang VND: " + doi+ " usd");

        }
    }
}
