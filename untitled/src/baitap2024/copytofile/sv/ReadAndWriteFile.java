package baitap2024.copytofile.sv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> Read(String filePath) {
        File file = new File(filePath);
        FileReader fr = null;
        BufferedReader br = null;
        List<String> list = new ArrayList<>();
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }
    public static void Write(String filePath, List<String> list, boolean isAppend) {
        File file = new File(filePath);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, isAppend);
            bw = new BufferedWriter(fw);
            for (String str : list){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

