package baitap2024.demo;

public class demothamchieu {
    public static void main(String[] args) {
  int b = 10;
  demothamchieu(b);
  System.out.println("ngoài hàm: "+b);

    }
    public static void demothamchieu(int a) {
        for (int i = 0; i < 10; i++) {
            a++;
        }
        System.out.println("trong hàm: "+ a);
    }
}
