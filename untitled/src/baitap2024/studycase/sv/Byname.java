package baitap2024.studycase.sv;

import baitap2024.studycase.mod.Product;

import java.util.Comparator;

public class Byname implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
