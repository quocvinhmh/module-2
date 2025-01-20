package baitap2024.casesudy.service;

import baitap2024.casesudy.model.Vehicle;
import baitap2024.casesudy.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IXeService {
    @Override
    public void showxe() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = ReadAndWrite.ReadFileXemayXema();
        for (Vehicle Vehicle : vehicleList){
            System.out.println(Vehicle);
        }
    }

    @Override
    public boolean delete() {
        List<Vehicle> xeTaiList = new ArrayList<>();
        xeTaiList = ReadAndWrite.ReadFileXemayXema();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Biển kiểm soát xóa:");
            String bienKiemSoat = scanner.nextLine();
            for (int i = 0; i < xeTaiList.size(); i++) {
                if (bienKiemSoat.equals(xeTaiList.get(i).getBienkiemsoat())) {
                    System.out.println("   Xác nhận xoá phương tiện " + bienKiemSoat + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choose = Integer.parseInt(scanner.nextLine());
                    if (choose == 1) {
                        xeTaiList.remove(i);
                        ReadAndWrite.WriteFileXetai(xeTaiList);
                    } else {
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
        List<Vehicle> xeTaiList = new ArrayList<>();
        xeTaiList = ReadAndWrite.ReadFileXemayXema();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Biển kiểm soát cần thêm mới:");
            String bienKiemSoat = scanner.nextLine();
            System.out.println("Hãng sản xuất cần thêm mới:");
            String hangSanXuat = scanner.nextLine();
            System.out.println("Năm sản xuất cần thêm mới:");
            int namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Chủ sở hữu cần thêm mới:");
            String chuSoHuu = scanner.nextLine();
            System.out.println("Tải trọng cần thêm mới:");
            float taiTrong = Float.parseFloat(scanner.nextLine());
            xeTaiList.add(new Vehicle(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));
            ReadAndWrite.WriteFileXetai(xeTaiList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}

