package baitap2024.bai_tap.trienkhaiinterface;

public class resizeable_test {
    public static void main(String[] args) {
        resizeable app = new resizeable();
        System.out.println(app);
        app = new resizeable(2.3,5.8);
        System.out.println(app);
        app = new resizeable("green",true, 2.4,23);
        System.out.println(app);
    }
}
