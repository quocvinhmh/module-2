package baitap2024.thuc_hanh.Framework.service;

public class mod {
    private int id;
    private String name;
    private double price;

    public mod(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public mod(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "mod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

