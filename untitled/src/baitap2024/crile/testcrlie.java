package baitap2024.crile;

public class testcrlie {
    public static void main(String[] args) {
        crile c1 = new crile();
        System.out.println("=== Test before===");
        System.out.println(c1.getX());
        System.out.println(c1.getColor());
        System.out.println("=== Test after===");
        c1.setX(100);
        c1.setColor("blue");
        System.out.println(c1.getX());
        System.out.println(c1.getColor());
    }
}
