package baitap2024.bai_tap.ketthua;

public class run {
    public static void main(String[] args) {
        circle c = new circle(4,"red");
        cylinder cy = new cylinder(c.getRadius(),c.getColor(),6);
        System.out.println(c.tostring());
        System.out.println(cy);

    }
}
