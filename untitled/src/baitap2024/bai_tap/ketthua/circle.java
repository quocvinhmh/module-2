package baitap2024.bai_tap.ketthua;

public class circle {
    private double radius;
    private String color;
    public circle() {}

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String tostring(){
return  "radius: " + radius + " color: " + color;
    }
}
