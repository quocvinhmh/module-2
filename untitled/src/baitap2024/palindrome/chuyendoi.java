package baitap2024.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class chuyendoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập số: ");
        int n = Integer.parseInt(sc.nextLine());
        int number = n;
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
          int binar = 0;
        while (!stack.isEmpty()) {
            binar = binar * 10 + stack.pop();
        }
        System.out.println("số nhị phân của "+ n + " là "+ binar);
    }
}
