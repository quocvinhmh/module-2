package baitap2024.casesudy.sv;

import baitap2024.casesudy.mod.oto;
import baitap2024.casesudy.mod.xemay;
import baitap2024.casesudy.mod.xetai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String FILE_OTO = "src/baitap2024/casesudy/file/oto.csv";
    public static final String FILE_XEMAY = "src/baitap2024/casesudy/file/xemay.csv";
    public static final String FILE_XETAI = "src/baitap2024/casesudy/file/xetai.csv";

    public static List<oto> ReadFile() {
        List<oto> lst = new ArrayList<>();
        File file = new File(FILE_OTO);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            do {
                line = br.readLine();
                if (line != null) {
                    String bienKiemSoat = line.split(",")[0];
                    String tenHangSanXuat = line.split(",")[1];
                    int namSanXuat = Integer.parseInt(line.split(",")[2]);
                    String chuSoHuu = line.split(",")[3];
                    int soChoNgoi = Integer.parseInt(line.split(",")[4]);
                    String kieuXe = line.split(",")[5];
                    lst.add(new oto(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            lst = new ArrayList<>();
        } catch (FileNotFoundException e) {
            System.out.println("FILE_NOT_FOUND");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lst;
    }

    public static List<xemay> ReadFileXemay() {
        List<xemay> lst = new ArrayList<>();
        File file = new File(FILE_XEMAY);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;
            do {
                line = br.readLine();
                if (line != null) {
                    int congsuat = Integer.parseInt(line.split(",")[0]);
                    String bienkiemsoat = line.split(",")[1];
                    String hangsanxuat = line.split(",")[2];
                    int namsanxuat = Integer.parseInt(line.split(",")[3]);
                    String chusohuu = line.split(",")[4];
                    lst.add(new xemay(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu, congsuat));
                }
            } while (line != null);
            br.close();
        } catch (EOFException e) {
            lst = new ArrayList<>();
        } catch (FileNotFoundException e) {
            System.out.println("FILE_NOT_FOUND" );
        } catch (IOException e) {
            System.out.println("IO_EXCEPTION");
        }
        return lst;
    }

    public static List<xetai> ReadFileXemayXema() {
        List<xetai> lst = new ArrayList<>();
        File file = new File(FILE_XETAI);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = null;

            do {
                line = br.readLine();
                if (line != null) {
                    float taitrong = Integer.parseInt(line.split(",")[0]);
                    String bienkiemsoat = line.split(",")[1];
                    String hangsanxuat = line.split(",")[2];
                    int namsanxuat = Integer.parseInt(line.split(",")[3]);
                    String chusohuu = line.split(",")[4];
                    lst.add(new xetai(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu, taitrong));
                }
            }while (line != null);
            br.close();
        }catch (EOFException e) {
            lst = new ArrayList<>();
        }
         catch (FileNotFoundException ex) {
             System.out.println("FILE_NOT_FOUND");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    return lst;
    }
    public static void WriteFile(List<oto> lst) throws IOException {
        File file = new File(FILE_OTO);
        FileWriter fr = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fr);
        boolean flag = true ;
        for (oto o : lst) {
            if (!flag) {
                bw.newLine();
            }
            bw.write(o.getBienkiemsoat()+","+o.getHangsanxuat()+","+o.getNamsanxuat()+","+o.getChusohuu()+","+o.getSocho()+","+o.getKieuxe());
            flag = false ;
        }
        bw.close();
    }
    public static void WriteFileXemay(List<xemay> lst) throws IOException {
        File file = new File(FILE_XEMAY);
        FileWriter fr = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fr);
        boolean flag = true ;
        for (xemay o : lst) {
            if (!flag) {
                bw.newLine();
            }
            bw.write(o.getBienkiemsoat()+","+o.getHangsanxuat()+","+o.getNamsanxuat()+","+o.getChusohuu()+","+o.getCongxuat());
            flag = false ;
        }
        bw.close();
    }
    public static void WriteFileXetai(List<xetai> lst) throws IOException {
        File file = new File(FILE_XETAI);
        FileWriter fr = new FileWriter(file,false);
        BufferedWriter bw = new BufferedWriter(fr);
        boolean flag = true ;
        for (xetai o : lst) {
            if (!flag) {
                bw.newLine();
            }
            bw.write(o.getBienkiemsoat() + "," + o.getHangsanxuat() + "," + o.getNamsanxuat()
                    + "," + o.getChusohuu() + "," + o.getTaitrong());
        }
        bw.close();
    }
}
