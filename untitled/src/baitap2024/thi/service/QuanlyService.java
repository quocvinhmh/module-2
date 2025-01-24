package baitap2024.thi.service;


import baitap2024.thi.mod.QuanLy;
import baitap2024.thi.util.ReadAndWrite;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlyService implements IDQuanlyService {
    @Override
    public List<QuanLy> show() {
        List<QuanLy> productList = new ArrayList<>();
        productList = ReadAndWrite.read();
        for (QuanLy o : productList) {
            System.out.println(o);
        }
        return productList;
    }

    @Override
    public boolean delete() {
        List<QuanLy> productList = new ArrayList<>();
        productList = ReadAndWrite.read();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Số điện thoại: ");
           String name = sc.nextLine().replaceAll("[^\\d]", "");
            if (name.length()!= 10){
                throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
            }else {
            for (int i = 0; i < productList.size(); i++) {
                if (name.equals(productList.get(i).getSdt())) {
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
        try {
            System.out.println("Số điện thoại cần thêm mới:");
            String sdt = scanner.nextLine().replaceAll("[^\\d]", "");
            if (sdt.length()!= 10){
                throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
            }
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
            if (EmailValidator.isValidEmail(email)){
                throw new IllegalArgumentException("Vui lòng nhập đúng định dạng Email!");
            }
            oToList.add(new QuanLy(sdt, nhom, hovaten, sex, id, born, email));
            ReadAndWrite.write(oToList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean update() throws IOException {
        List<QuanLy> oToList = new ArrayList<>();
        oToList = ReadAndWrite.read();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại muốn sữa!");
        String sdt1 = sc.nextLine();
        if (sdt1.length()!= 10){
            throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
        }
        for (int i = 0; i < oToList.size(); i++) {
            if (!sdt1.equals(oToList.get(i).getSdt())) {
                oToList.remove(i);
                System.out.println("Thêm mới: ");
                System.out.println("Số điện thoại cần thêm mới:");
                String sdt = sc.nextLine().replaceAll("[^\\d]", "");
                if (sdt.length()!= 10){
                    throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
                }
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
                EmailValidator emailValidator = new EmailValidator();
                if (!EmailValidator.isValidEmail(email)){
                    throw new IllegalArgumentException("Vui lòng nhập đúng định Email!");
                }
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
        String sdt = sc.nextLine();
        System.out.println("Nhập số điện thoại muốn tìm");
        if (sdt.length()!= 10){
            throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
        }
        for (QuanLy o : oToList) {
            if (sdt.equals(o.getSdt())) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Toàn bộ danh bạ trong bộ nhớ sẽ bị xóa.");
        System.out.println("Bạn có muốn tiếp tục không? (Y để xác nhận, nhấn phím khác để hủy):");
        String choice = scanner.nextLine().trim();
        if (!choice.equalsIgnoreCase("Y")) {
            return;
        }
List<QuanLy> oToList = show();
        if (oToList.isEmpty()) {
            System.out.println("Danh bạ hiện tại rỗng. Không có gì để lưu!");
            return;
        }else {
            for (int i = 0; i < oToList.size(); i++) {
                oToList.remove(i);
            }
            ReadAndWrite.write(oToList);
        }

        System.out.println("Lưu danh bạ thành công!");
    }
        }


