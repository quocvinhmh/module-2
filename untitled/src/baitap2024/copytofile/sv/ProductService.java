package baitap2024.copytofile.sv;

import baitap2024.copytofile.mod.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IDProductService{
    private final String Product_File = "src/baitap2024/studycase/data/produscts.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
private static List<Product> productslist = new ArrayList<>();

    @Override
    public List<Product> selectProduct() {
        List<Product> products = new ArrayList<>();
        List<String> productStringList = ReadAndWriteFile.Read(Product_File);
        for (String productString : productStringList) {
            String[] productArray = productString.split(",");
            products.add(new Product(Integer.parseInt(productArray[0]), productArray[1]));
        }
        return products;
    }
    @Override
    public void app(Product product) {
List<String> productsString = new ArrayList<>();
productsString.add(product.getInfoProduct());
 ReadAndWriteFile.Write(Product_File,productsString, APPEND);
    }

    @Override
    public boolean deleteProduct(int id) {
        List<Product> productslist = selectProduct();
        boolean flag = false;
        for (Product product : productslist) {
            if (product.getId() == id) {
                flag = true;
                productslist.remove(product);
                break;
            }
        }
        if (flag) {
            List<String> productsString = new ArrayList<>();
            for (Product product : productslist) {
                productsString.add(product.getInfoProduct());
            }
            ReadAndWriteFile.Write(Product_File,productsString, NOT_APPEND);
        }
        return flag;
    }

    @Override
    public boolean updateProduct(int id) {
        List<Product> productslist = selectProduct();
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <productslist.size(); i++) {
            if (productslist.get(i).getId() == id) {
                productslist.remove(i);
                int index = Integer.parseInt(scanner.nextLine());
                String name1 = scanner.nextLine();
                productslist.add(i, new Product(index, name1));
                flag = true;
            }
            if (flag){
                List<String> productsString = new ArrayList<>();
                for (Product product : productslist) {
                    productsString.add(product.getInfoProduct());
                }
                ReadAndWriteFile.Write(Product_File, productsString , NOT_APPEND);
        }
    }
        return flag;
}
    @Override
    public Product getProduct(int id) {
            for (Product product : productslist) {
                if (product.getId() == id) {
                    return product;
                }
            }
        return null;
    }

    @Override
    public void Byid() {
      List<Product> productslist = selectProduct();
      Collections.sort(productslist, new Byid());
      for (Product product : productslist) {
          System.out.println(product);
      }
    }

    @Override
    public void Byname() {
List<Product> productslist = selectProduct();
 Collections.sort(productslist, new Byname());
 for (Product product : productslist) {
     System.out.println(product);
 }
    }
}
