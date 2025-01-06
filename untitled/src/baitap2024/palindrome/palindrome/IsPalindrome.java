package baitap2024.palindrome.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public String isPalindrome(String input) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isLetter(c)) {
                char normal = Character.toLowerCase(c);
                stack.add(normal);
                queue.offer(normal);
            }
        }
        while(!stack.isEmpty() && !queue.isEmpty()) {
            if(!stack.pop().equals(queue.poll())) {
                return "Chuỗi không phải Palindrome";
            }
        }
        return "Chuỗi là Palindrome";
    }
}

