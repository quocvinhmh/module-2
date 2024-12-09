package baitap2024.bai_tap;

import java.util.Scanner;

public class ptb2 {
    public double  a,b,c;
    public ptb2(){

    }
    public ptb2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double tong3(){
        return this.a*this.b-4*this.c;
    }
    public double tong2(){
        double dela = tong3();
        if (dela < 0){
            return 0;
        }
        return (-this.b+ Math.sqrt(dela)/(2*this.a));
    }
    public double tong1(){
        double dela = tong3();
        if (dela < 0){
            return 0;
        }
        return (-this.b+ Math.sqrt(dela)/(2*this.a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số c: ");
        double c = Double.parseDouble(sc.nextLine());

        ptb2 t = new ptb2(a,b,c);
        double dela = t.tong3();
        if (dela > 0){
            double root1 = t.tong1();
            double root2 = t.tong2();
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } else if (dela == 0) {
            double root1 = t.tong1();
            System.out.println(root1);
        }else {
            System.out.println("The equation has no real root");
        }
    }
}

