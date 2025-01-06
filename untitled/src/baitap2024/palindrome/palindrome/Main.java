package baitap2024.palindrome.palindrome;

public class Main {
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        String test1 = "Able was I ere I saw Elba";
        String test2 = "Hello World";

        System.out.println("Chuỗi: \"" + test1 + "\"");
        System.out.println(isPalindrome.isPalindrome(test1));

        System.out.println("\nChuỗi: \"" + test2 + "\"");
        System.out.println(isPalindrome.isPalindrome(test2));
    }

}
