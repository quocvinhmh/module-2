package baitap2024.demo;

class Run1 {

    void display(){

        System.out.println("Run1");

    }
}

class Run2 extends Run1{

    void display2(){

        System.out.println("display2");

    }
}

public class test {

    public static void main(String[] args) {

        Run2 run = new Run2();

        run.display();

    }
}