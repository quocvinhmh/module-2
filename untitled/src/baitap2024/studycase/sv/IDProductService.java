package baitap2024.studycase.sv;

import baitap2024.studycase.mod.Product;

import java.util.List;

public interface IDProductService {
    List<Product> selectProduct();
    void app (Product product);
    boolean deleteProduct (int id);
    boolean updateProduct (int id);
    Product getProduct (int id);
    void Byid ();
    void Byname();
}
