package baitap2024.thuc_hanh.Framework.service;

import java.util.Scanner;

public class controll {
    static Scanner sc = new Scanner(System.in);
    static Manager manager = new Manager();
    public static void display() {
        while (true) {
            System.out.println("""
                    1. Thêm sản phẩm
                    2. Sửa thông tin sản phẩm
                    3. Xoá sản phẩm
                    4. Hiển thị danh sách sản phẩm
                    5. Tìm kiếm sản phẩm theo tên
                    6. Sắp xếp sản phẩm theo giá tăng dần
                    7. Sắp xếp sản phẩm theo giá giảm dần
                    8. Thoát""");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Thêm sản phảm!");
                    System.out.println("nhập id thêm:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập tên:");
                    String name = sc.nextLine();
                    System.out.println("nhập giá:");
                    double price = Double.parseDouble(sc.nextLine());
                    mod manager1 = new mod(id,name,price);
                 manager.add(manager1);
                    System.out.println("thêm sản phẩm thành công!");
                    break;
                    case 2:
                        System.out.println("sửa thông tin!");
                        int id1 = Integer.parseInt(sc.nextLine());
                        String name1 = sc.nextLine();
                        double price1 = Double.parseDouble(sc.nextLine());
                       if (manager.update(id1,name1,price1)) {
                           System.out.println("thêm sản phẩm thành công!");
                       }else {
                           System.out.println("thêm sản phẩm thất bại!!!");
                       }
                        break;
                        case 3:
                            System.out.println("xóa sản phẩm!");
                            System.out.println("nhập id cần xóa:");
                            int id2 = Integer.parseInt(sc.nextLine());
                            if (manager.remove(id2)) {
                                System.out.println("xóa sản phẩm thành công!");
                            }else {
                                System.out.println("xóa thất bại!!!");
                            }

                            break;
                            case 4:
                                System.out.println("hiển thị sản phẩm:");
                              manager.display();
break;
                case 5:
                    System.out.println("nhập tên sản phẩm muốn tìm:");
                    String name3 = sc.nextLine();
                    if (manager.search(name3)){
                        System.out.println("sản phẩm:"+ name3);
                    }else {
                        System.out.println("không tìm thấy sản phẩm!!!");
                    }
                    break;
                    case 6:
                        System.out.println("giá trị sản phẩm tăng dần:");
                     manager.tangdan();
                     manager.display();
                        break;
                case 7:
                    System.out.println("giá trị giam dần:");
                    manager.giamdan();
                    manager.display();
                    break;
                case 8:
                    System.out.println("thoát chương trình.......");
                    System.exit(0);
            }
        }
    }
}