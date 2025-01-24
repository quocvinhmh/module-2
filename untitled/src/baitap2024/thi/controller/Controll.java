package baitap2024.thi.controller;

import baitap2024.thi.service.Quanlyservice;

import java.io.IOException;
import java.util.Scanner;

public class Controll {
    Scanner scanner = new Scanner(System.in);
    Quanlyservice quanlyservice = new Quanlyservice();
    boolean e = true;

    public void Controll() throws IOException {
        while (true) {
            System.out.println("Chọn chức năng: \n" +
                    "1. Xem danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Chỉnh sửa thông tin sản phẩm\n" +
                    "5. Tìm Kiếm\n" +
                    "6. Đọc từ file\n" +
                    "7. Ghi từ file\n" +
                    "8. Thoát.");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: quanlyservice.showxe();
                    break;
                case 2:
if (!quanlyservice.add()){
    System.out.println("Thêm mới thành công");
}else {
    System.out.println("Thêm mới thất bại");
}
                    break;
                case 3:
if(!quanlyservice.delete()){
    System.out.println("Xóa thành công");
}else {
    System.out.println("Xóa thất bại");
}

                    break;
                case 4:
if (!quanlyservice.update()){
    System.out.println("Update thành công");
}else {
    System.out.println("Update Xóa thất bại");
}

                    break;
                case 5:
quanlyservice.tim();
                    break;
                case 6:
quanlyservice.readfile();
                    break;
                case 7:
quanlyservice.savefile();
break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
