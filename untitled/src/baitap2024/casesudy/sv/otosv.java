package baitap2024.casesudy.sv;

import baitap2024.casesudy.mod.oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class otosv implements IDsv{

    @Override
    public void showxe() {
        List<oto> productList = new ArrayList<oto>();
        productList = ReadAndWrite.ReadFile();
        for (oto o : productList) {
            System.out.println(o);
        }
    }

    @Override
    public boolean delete() {
        List<oto> productList = new ArrayList<oto>();
        productList = ReadAndWrite.ReadFile();
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Biển kiểm soát: ");
           String name = sc.nextLine();
           for (int i = 0; i < productList.size(); i++) {
               if (name.equals(productList.get(i).getBienkiemsoat())){
                   System.out.println("   Xác nhận xoá phương tiện " + name + ":" + "\n" +
                           "   1. Yes" + "\n" +
                           "   2. No");
                   int choice = Integer.parseInt(sc.nextLine());
                   if (choice == 1) {
                       productList.remove(i);
                       ReadAndWrite.WriteFile(productList);
                   }else {
                       return false;
                   }
               }
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    return true;
    }

    @Override
    public boolean addxe() {
        Scanner scanner = new Scanner(System.in);
        List<oto> oToList = new ArrayList<>();
        oToList = ReadAndWrite.ReadFile();
        try {
            System.out.println("Biển kiểm soát cần thêm mới:");
            String bienKiemSoat = scanner.nextLine();
            System.out.println("Hãng sản xuất cần thêm mới:");
            String hangSanXuat = scanner.nextLine();
            System.out.println("Năm sản xuất cần thêm mới:");
            int namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Chủ sở hữu cần thêm mới:");
            String chuSoHuu = scanner.nextLine();
            System.out.println("Số chỗ ngồi cần thêm mới:");
            int soChoNgoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Kiểu xe cần thêm mới:");
            String kieuXe = scanner.nextLine();
            oToList.add(new oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
            ReadAndWrite.WriteFile(oToList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}


