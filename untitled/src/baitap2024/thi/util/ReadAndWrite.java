package baitap2024.thi.util;


import baitap2024.thi.mod.QuanLy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String File_DANHBA = "src/baitap2024/thi/data/data/contacts.csv";
    public static List<QuanLy> read() {
      List<QuanLy> danhba = new ArrayList<>();
      File file = new File(File_DANHBA);
        FileReader fr = null;
      BufferedReader br = null;
      try{
          fr = new FileReader(file);
           br = new BufferedReader(fr);
           String line = null;
           do {
               if ((line = br.readLine())!= null) {
                  int sdt = Integer.parseInt(line.split(",")[0]);
                  int nhom = Integer.parseInt(line.split(",")[1]);
String hovaten = line.split(",")[2];
String sex = line.split(",")[3];
String id = line.split(",")[4];
String born = line.split(",")[5];
String email = line.split(",")[6];
danhba.add(new QuanLy(sdt,nhom,hovaten,sex,id,born,email));
               }
           }while (line != null);
           br.close();
      } catch (EOFException e) {
          danhba = new ArrayList<>();
      } catch (FileNotFoundException e) {
          System.out.println("FILE_NOT_FOUND" );
      } catch (IOException e) {
          System.out.println("IO_EXCEPTION");
      }
    return danhba;
    }
    public static void write(List<QuanLy> danhba) throws IOException {
        File file = new File(File_DANHBA);
        FileWriter fr = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fr);
        boolean flag = true ;
        for (QuanLy o : danhba) {
            if (!flag) {
                bw.newLine();
            }
            bw.write(o.getSdt() + "," + o.getNhomdanhba() + "," + o.getHovaten()
                    + "," + o.getGioitinh() + "," + o.getDiachi()+","+o.getNgaysinh()+","+o.getEmail());
        }
        bw.close();
    }
}

