package baitap2024.thi.service;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {// Biểu thức chính quy cho email
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

    // Hàm kiểm tra email
    public static boolean isValidEmail(String email) {
        if (Pattern.matches(EMAIL_REGEX, email)){
            return false;
        };
        return true;
    }
}

