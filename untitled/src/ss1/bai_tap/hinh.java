package ss1.bai_tap;

import java.util.Scanner;

public class hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Chọn chức năng\n" +
                            "1. Vẽ hình chữ nhật\n" +
                            "2. Vẽ tam giác vuông (botton-left)\n" +
                            "3. Vẽ tam giác vuông (top-left)\n" +
                            "4. Vẽ tam giác cân\n" +
                            "5. Thoát chương trình !\n"
            );
            int chois = Integer.parseInt(sc.nextLine());
            switch (chois) {
                case 1:
                    System.out.println("----hình chữ nhật-----");
                    System.out.println("hãy nhập chiều rộng HCN :");
                    int cr = Integer.parseInt(sc.nextLine());
                    System.out.println("hãy nhập chiều dài HCN :");
                    int cd = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cr; i++) {
                        for (int j = 0; j < cd; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                    }
                    break;
                case 2:
                    System.out.println("-------hình tam giác vuông-----");
                    System.out.println("nhập chiều dài của hình: ");
                    cd = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < cd; i++) {
                        for (int j = 0; j < i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("-------hình tam giác vuông-----");
                    System.out.println("nhập chiều dài của hình: ");
                    cd = Integer.parseInt(sc.nextLine());
                    for (int i = cd; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("-------hình tam giác cân-----");
                    System.out.println("nhập chiều dài của hình: ");
                    cd = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= cd; i++) {
                        for (int j = 1; j <= cd-i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                    case 5:
                        System.out.println("kết thúc chương trình!");
                        System.exit(0);
                        break;

            }

        }
    }
    }
