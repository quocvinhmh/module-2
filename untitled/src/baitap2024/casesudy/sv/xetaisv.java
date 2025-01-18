package baitap2024.casesudy.sv;

import baitap2024.casesudy.mod.xetai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xetaisv implements IDsv{
    @Override
    public void showxe() {
        List<xetai> xetaiList = new ArrayList<>();
        xetaiList = ReadAndWrite.ReadFileXemayXema();
        for (xetai xetai : xetaiList){
            System.out.println(xetai);
        }
    }

    @Override
    public boolean delete() {
        List<xetai> xeTaiList = new ArrayList<>();
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
        List<xetai> xeTaiList = new ArrayList<>();
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
            xeTaiList.add(new xetai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));
            ReadAndWrite.WriteFileXetai(xeTaiList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}

