package baitap2024.thi.service;


import baitap2024.thi.mod.QuanLy;
import baitap2024.thi.util.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanlyservice implements IDQuanlyservice {
    @Override
    public void showxe() {
        List<QuanLy> productList = new ArrayList<>();
        productList = ReadAndWrite.read();
        for (QuanLy o : productList) {
            System.out.println(o);
        }
    }

    @Override
    public boolean delete() {
        List<QuanLy> productList = new ArrayList<>();
        productList = ReadAndWrite.read();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Số điện thoại: ");
            int name = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < productList.size(); i++) {
                if (name == productList.get(i).getSdt()) {
                    System.out.println("   Xác nhận xoá  " + name + ":" + "\n" +
                            "   1. Yes" + "\n" +
                            "   2. No");
                    int choice = Integer.parseInt(sc.nextLine());
                    if (choice == 1) {
                        productList.remove(i);
                        ReadAndWrite.write(productList);
                    } else {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    @Override
    public boolean add() {
        Scanner scanner = new Scanner(System.in);
        List<QuanLy> oToList = new ArrayList<>();
        oToList = ReadAndWrite.read();
        try {
            System.out.println("Số điện thoại cần thêm mới:");
            int sdt = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhóm danh bạ cần thêm mới:");
            int nhom = Integer.parseInt(scanner.nextLine());
            System.out.println("Họ và tên cần thêm mới:");
            String hovaten = scanner.nextLine();
            System.out.println("Giới tính cần thêm mới:");
            String sex = scanner.nextLine();
            System.out.println("Địa chỉ cần thêm mới:");
            String id = scanner.nextLine();
            System.out.println("Ngày sinh cần thêm mới:");
            String born = scanner.nextLine();
            System.out.println("Email cần thêm mới:");
            String email = scanner.nextLine();
            oToList.add(new QuanLy(sdt, nhom, hovaten, sex, id, born, email));
            ReadAndWrite.write(oToList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update() throws IOException {
        List<QuanLy> oToList = new ArrayList<>();
        oToList = ReadAndWrite.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại muốn sữa!");
        int sdt1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < oToList.size(); i++) {
            if (sdt1 == oToList.get(i).getSdt()) {
                oToList.remove(i);
                System.out.println("Thêm mới: ");
                System.out.println("Số điện thoại cần thêm mới:");
                int sdt = Integer.parseInt(sc.nextLine());
                System.out.println("Nhóm danh bạ cần thêm mới:");
                int nhom = Integer.parseInt(sc.nextLine());
                System.out.println("Họ và tên cần thêm mới:");
                String hovaten = sc.nextLine();
                System.out.println("Giới tính cần thêm mới:");
                String sex = sc.nextLine();
                System.out.println("Địa chỉ cần thêm mới:");
                String id = sc.nextLine();
                System.out.println("Ngày sinh cần thêm mới:");
                String born = sc.nextLine();
                System.out.println("Email cần thêm mới:");
                String email = sc.nextLine();
                oToList.add(i, new QuanLy(sdt, nhom, hovaten, sex, id, born, email));
                ReadAndWrite.write(oToList);
            }
        }
        return false;
    }

    @Override
    public void tim() {
        List<QuanLy> oToList = new ArrayList<>();
        oToList = ReadAndWrite.read();
        Scanner sc = new Scanner(System.in);
        int sdt = Integer.parseInt(sc.nextLine());
        for (QuanLy o : oToList) {
            if (sdt == o.getSdt()) {
                System.out.println(o);
            }
        }
    }

    @Override
    public void readfile() throws IOException {
        List<QuanLy> oToList = new ArrayList<>();
        oToList = ReadAndWrite.read();
        System.out.println("Đọc dữ liệu từ file:");
        for (QuanLy o : oToList) {
            System.out.println(o);
        }
    }

    @Override
    public void savefile() throws IOException {
        List<QuanLy> oToList = new ArrayList<>();
        System.out.println("Lưu dữ liệu và cập nhật hết:");
        for (QuanLy o : oToList) {
            if (o != null){

                ReadAndWrite.write((List<QuanLy>) o);
            }
            for (int i = 0; i < oToList.size(); i++) {
                oToList.remove(i);
            }
        }
    }
}
