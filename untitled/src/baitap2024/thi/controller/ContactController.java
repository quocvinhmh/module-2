package baitap2024.thi.controller;

import baitap2024.thi.service.QuanlyService;

import java.io.IOException;
import java.util.Scanner;

public class ContactController {
    Scanner scanner = new Scanner(System.in);
    QuanlyService quanlyservice = new QuanlyService();


    public void Controls() throws IOException {
        while (true) {
            System.out.println("""
                    Chọn chức năng:
                    1. Xem danh sách
                    2. Thêm mới
                    3. Xóa sản phẩm
                    4. Chỉnh sửa thông tin sản phẩm
                    5. Tìm Kiếm
                    6. Đọc từ file
                    7. Ghi từ file
                    8. Thoát.""");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: quanlyservice.show();
                    break;
                case 2:
if (quanlyservice.add()){
    System.out.println("Thêm mới thành công");
}else {
    System.out.println("Thêm mới thất bại");
}
                    break;
                case 3:
if(quanlyservice.delete()){
    System.out.println("Xóa thành công");
}else {
    System.out.println("Không tìm thấy số điện thoại\n" +
            "Xóa thất bại!");
}

                    break;
                case 4:
if (quanlyservice.update()){
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
