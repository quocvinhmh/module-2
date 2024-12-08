package baitap2024.bai_tap;

public class nguyento {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        while (a<20){
boolean chiose = true;
for (int j = 2; j < Math.sqrt(b); j++) {
    if (b % j == 0){
        chiose = false;
        break;
    }
    if (chiose) {
        System.out.println(b);
        a++;
    }
}
            b++;
        }
    }
}
