package baitap2024.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class daonguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập kích cỡ của stack");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.println("nhập giá trị: ");
            stack.push(Integer.parseInt(sc.nextLine()));
        }
        System.out.println("trước đảo ngược: "+ stack);
        Stack<Integer> reversedStack = new Stack<>();
       for (int i = 0; i < size; i++) {
           reversedStack.push(stack.pop());
       }
        System.out.println("đảo ngược: "+ reversedStack);

    }
}
