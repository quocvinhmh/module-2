package baitap2024.bai_tap.trienkhaiinterface;

public class resizeable extends shape implements thaydoi {
    private double width;
    private double length;

    public resizeable(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public resizeable(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "resizeable [width=" + width + ", length=" + length + "]";
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent;
        this.length = this.length * percent;
    }
}
