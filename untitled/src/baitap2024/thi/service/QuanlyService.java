package baitap2024.thi.service;

import baitap2024.thi.mod.Contact;
import baitap2024.thi.util.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlyService implements ContactService {
    private static final String PHONE_REGEX = "^[0-9]{10}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final String ERROR_PHONE = "Số điện thoại phải có đúng 10 chữ số!";
    private static final String ERROR_EMAIL = "Email không hợp lệ!";
    private final List<Contact> danhBaList = new ArrayList<>(); // Dữ liệu trong bộ nhớ

    @Override
    public void show() {
        if (danhBaList.isEmpty()) {
            System.out.println("Danh bạ hiện tại rỗng.");
        } else {
            for (Contact contact : danhBaList) {
                System.out.println(contact);
            }
        }
    }

    @Override
    public boolean delete() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần xóa:");
        String sdt = sc.nextLine();
        if (!isValidPhone(sdt)) {
            throw new IllegalArgumentException(ERROR_PHONE);
        }

        if (sdt.length() != 10) {
            System.out.println("Số điện thoại phải có đúng 10 chữ số!");
            return false;
        }

        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSdt().equals(sdt)) {
                System.out.println("Xác nhận xóa danh bạ với số điện thoại " + sdt + ": (Y để xác nhận)");
                String choice = sc.nextLine().trim();
                if (choice.equalsIgnoreCase("Y")) {
                    danhBaList.remove(i);
                    ReadAndWrite.write(danhBaList);
                    System.out.println("Xóa thành công!");
                    return true;
                } else {
                    System.out.println("Hủy xóa.");
                    return false;
                }
            }
        }
        System.out.println("Không tìm thấy danh bạ với số điện thoại trên.");
        return false;
    }

    @Override
    public boolean add() throws IOException {
        Contact contact = nhapThongTinDanhBa();
        if (contact != null) {
            danhBaList.add(contact);
            System.out.println("Thêm mới danh bạ thành công!");
            return true;
        }
        return false;
    }

    @Override
    public boolean update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần cập nhật:");
        String sdt = sc.nextLine();
        if (sdt.length() != 10) {
            System.out.println("Số điện thoại phải có đúng 10 chữ số!");
            return false;
        }

        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSdt().equals(sdt)) {
                System.out.println("Thông tin hiện tại: " + danhBaList.get(i));
                Contact contactMoi = nhapThongTinDanhBa();
                if (contactMoi != null) {
                    danhBaList.set(i, contactMoi);
                    System.out.println("Cập nhật thành công!");
                    return true;
                }
                return false;
            }
        }
        System.out.println("Không tìm thấy danh bạ với số điện thoại trên.");
        return false;
    }

    @Override
    public void tim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại hoặc họ tên cần tìm:");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (Contact contact : danhBaList) {
            if (contact.getSdt().contains(keyword) || contact.getHovaten().toLowerCase().contains(keyword)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả phù hợp.");
        }
    }

    @Override
    public void readfile()  {
        List<Contact> dulieu = ReadAndWrite.read();
        System.out.println("Đọc dữ liệu từ file thành công!");
        for (Contact contact : dulieu) {
            System.out.println(contact);
        }
    }

    @Override
    public void savefile() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cảnh báo: Toàn bộ file hiện tại sẽ bị ghi đè.");
        System.out.println("Bạn có muốn tiếp tục không? (Y để xác nhận, nhấn phím khác để hủy):");
        String choice = sc.nextLine().trim();

        if (choice.equalsIgnoreCase("Y")) {
            ReadAndWrite.write(danhBaList);
            System.out.println("Lưu danh bạ thành công!");
        } else {
            System.out.println("Hủy lưu.");
        }
    }

    // Hàm nhập thông tin danh bạ
    private Contact nhapThongTinDanhBa() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số điện thoại:");
            String sdt = sc.nextLine();
            if (sdt.length() != 10) {
                throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số!");
            }

            System.out.println("Nhập nhóm:");
            int nhom = Integer.parseInt(sc.nextLine());

            System.out.println("Nhập họ và tên:");
            String hovaten = sc.nextLine();

            System.out.println("Nhập giới tính:");
            String sex = sc.nextLine();

            System.out.println("Nhập địa chỉ:");
            String diachi = sc.nextLine();

            System.out.println("Nhập ngày sinh:");
            String ngaysinh = sc.nextLine();

            System.out.println("Nhập email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException(ERROR_EMAIL);
            }

            return new Contact(sdt, nhom, hovaten, sex, diachi, ngaysinh, email);
        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu: " + e.getMessage());
            return null;
        }
    }
    // Kiểm tra số điện thoại hợp lệ
    private boolean isValidPhone(String phone) {
        return phone.matches(PHONE_REGEX);
    }

    // Kiểm tra email hợp lệ
    private boolean isValidEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
}

