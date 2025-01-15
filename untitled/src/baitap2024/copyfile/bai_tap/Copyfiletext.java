package baitap2024.copyfile.bai_tap;


import java.io.*;

public class Copyfiletext {
    public static void main(String[] args) {
   File sourcefile = new File("src/baitap2024/copyfile/bai_tap/sourcefile.csv");
       File targetfile = new File("src/baitap2024/copyfile/bai_tap/targetfile.csv");
       try(
       FileReader fr = new FileReader(sourcefile);
       FileWriter fw = new FileWriter(targetfile);
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            int count = 0;
            int c;
            while ((c = br.read()) != -1) {
                bw.write(c);
                count++;
            }
            System.out.println("số ký tự trong File:"+count);
String line;
while ((line = br.readLine()) != null) {
    bw.write(line);
    bw.newLine();
}
            System.out.println("sao chép File thành công!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception"+e.getMessage());
        }
    }
}
