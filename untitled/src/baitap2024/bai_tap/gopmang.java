package baitap2024.bai_tap;


import java.util.Arrays;

public class gopmang {
    public static void main(String[] args) {
        int[] n = {10,31,213,32,4};
        int[] n2 = {2,23,2,321};
        int[] n3 = new int[(n.length + n2.length)];
        for (int i = 0; i < n.length; i++) {
            n3[i] = n[i];
        }
        for (int i = 0; i < n2.length; i++) {
            n3[i + n.length] = n2[i];
        }
        System.out.println(Arrays.toString(n3));

    }
}
