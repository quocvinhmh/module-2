package baitap2024.baitap_quan_ly_khach_hang.controller;

import baitap2024.baitap_quan_ly_khach_hang.model.Student;
import baitap2024.baitap_quan_ly_khach_hang.service.StudentService;

import java.util.Scanner;

public class Controller {
    static StudentService studentService = new StudentService();
 public static void controller(){
     Scanner sc = new Scanner(System.in);
     while (true) {
     System.out.println("-----Menu-----");
     System.out.println(
                     "1. Xem danh sách\n"+
                     "2. Thêm mới\n"+
                     "3. Xóa\n"+
                             "4. updata\n"+
                     "5. Thoát\n"
     );
     int choose = Integer.parseInt(sc.nextLine());
         switch (choose) {
             case 1:
                 Student[] students = studentService.findAll();
                 for (Student student : students) {
                     if (student != null) {
                         System.out.println(student);
                     }
                 }
                 break;
             case 2:
                 System.out.println("id: ");
                 int id = Integer.parseInt(sc.nextLine());
                 System.out.println("name: ");
                 String name = sc.nextLine();
                 Student student = new Student(id, name);
                 studentService.save(student);
                 System.out.println(student);
                 break;
             case 3:
                 System.out.println("-------xóa-------");
                 System.out.println("nhập id cần xóa:");
                 StudentService studentService = new StudentService();
                 int de = Integer.parseInt(sc.nextLine());
                 boolean delete = studentService.delete(de);
                 if (delete) {
                     System.out.println("xóa thành công");
                 }else {
                     System.out.println("xóa không thành công"+ de);
                 }
                 break;
             case 4:
                 System.out.println("-----UpData-----");
                 StudentService studentService2 = new StudentService();
                 System.out.println("nhập id cần updata:");
                 int up = Integer.parseInt(sc.nextLine());
                 System.out.println("nhập tên cần sữa:");
                 String newname = sc.nextLine();
                 boolean ud = studentService2.up(up, newname);
                 if (ud){
                     System.out.println("thêm mới thành công: ");
                 }else{
                     System.out.println("thêm mới không thành công:\n"+"không tìm thấy địa chỉ id:"+ up);
                 }
                 break;
             case 5:
                 System.out.println("-----Thoát-----");
                 break;
                 default:
         }
     }
 }
}
