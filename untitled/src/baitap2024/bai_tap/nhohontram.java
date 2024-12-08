package baitap2024.bai_tap;

public class nhohontram {
    public static void main(String[] args) {
        int a = 0;
       while (a < 100) {
           boolean b = true;
           for (int i = 2; i <= Math.sqrt(a) ; i++) {
               if (a % i == 0) {
                   b = false;
               }
           }
           a++;
           if (b){
               System.out.println(a);
           }
        }
    }
}
