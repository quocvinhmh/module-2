package baitap2024.copytofile.sv;

import baitap2024.copytofile.mod.Product;

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
