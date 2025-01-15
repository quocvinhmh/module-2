package baitap2024.studycase.sv;

import baitap2024.studycase.mod.Product;

import java.util.Comparator;

public class Byid implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() == o2.getId()){
            return o1.getName().compareTo(o2.getName());
        }else {
            return o1.getId() - o2.getId();
        }
    }
}
