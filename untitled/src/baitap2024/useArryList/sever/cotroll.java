package baitap2024.useArryList.sever;

import java.util.ArrayList;
import java.util.Scanner;
public class cotroll {
    private static final severID studenss = new sever();
    public static void display(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----Menu-----");
            System.out.println(
                    "1. Xem danh sách\n"+
                            "2. Thêm mới\n"+
                            "3. Xóa\n"+
                            "4. updata\n"+
                            "5. Thoát\n"
            );
            int choice = Integer.parseInt(String.valueOf(sc.nextInt()));
            switch(choice){
                case 1:
                    ArrayList<dk> studens = studenss.getStudents();
                    System.out.println("xem danh sách:");
                    for(dk studen : studens){
                        System.out.println(studen);
                    }
                    break;
                    case 2:
                        System.out.println("thêm mới....");
                        System.out.println("nhập ID:");
                        int id = Integer.parseInt(String.valueOf(sc.nextInt()));
                        System.out.println("nhập tên muốn sữa:");
                        String name = sc.next();
                        studenss.ud(id, name);
                        break;
                        case 3:
                            System.out.println("xóa....");
                            System.out.println("nhập ID muốn xóa:");
                            int id1 = Integer.parseInt(String.valueOf(sc.nextInt()));
                            studenss.del(id1);
            }
        }
    }
}