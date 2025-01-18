package baitap2024.casesudy.sv;

import baitap2024.casesudy.mod.xemay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xemaysv implements IDsv{

    @Override
    public void showxe() {
        List<xemay> list = new ArrayList<>();
        list = ReadAndWrite.ReadFileXemay();
        for (xemay x : list) {
            System.out.println(x);
        }
    }

    @Override
    public boolean delete() {
        Scanner sc = new Scanner(System.in);
        List<xemay> list = new ArrayList<>();
        list = ReadAndWrite.ReadFileXemay();
        try {
            System.out.println("Biển kiểm soát: ");
            String name = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (name.equals(list.get(i).getBienkiemsoat())) {
                    System.out.println("   Xác nhận xoá phương tiện " + name + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choice = Integer.parseInt(sc.nextLine());
                    if (choice == 1) {
                        list.remove(i);
                        ReadAndWrite.WriteFileXemay(list);
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return true;}
    @Override
    public boolean addxe() {
        List<xemay> xeMayList = new ArrayList<>();
        xeMayList = ReadAndWrite.ReadFileXemay();
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
            System.out.println("Công suất cần thêm mới:");
            float congSuat = Float.parseFloat(scanner.nextLine());
            xeMayList.add(new xemay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat));
            ReadAndWrite.WriteFileXemay(xeMayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    }

