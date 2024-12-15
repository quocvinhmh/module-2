package baitap2024.bai_tap.ketthua;

public class cylinder extends circle{
    private double height;

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString(){
        return "cylinder [radius= "+ getRadius() + ", color= "+ getColor() + ", height= "+ height + "]";
    }
}
