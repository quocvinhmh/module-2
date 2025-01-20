package baitap2024.casesudy.model;

public class Truck {
    private String Bienkiemsoat;
    private String Hangsanxuat;
    private int Namsanxuat;
    private String Chusohuu;

    public Truck(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu) {
        Bienkiemsoat = bienkiemsoat;
        Hangsanxuat = hangsanxuat;
        Namsanxuat = namsanxuat;
        Chusohuu = chusohuu;
    }

    public Truck() {

    }

    public String getBienkiemsoat() {
        return Bienkiemsoat;
    }

    public void setBienkiemsoat(String bienkiemsoat) {
        Bienkiemsoat = bienkiemsoat;
    }

    public String getHangsanxuat() {
        return Hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        Hangsanxuat = hangsanxuat;
    }

    public int getNamsanxuat() {
        return Namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        Namsanxuat = namsanxuat;
    }

    public String getChusohuu() {
        return Chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        Chusohuu = chusohuu;
    }

    @Override
    public String toString() {
        return "xe{" +
                "Bienkiemsoat='" + Bienkiemsoat + '\'' +
                ", Hangsanxuat='" + Hangsanxuat + '\'' +
                ", Namsanxuat=" + Namsanxuat +
                ", Chusohuu='" + Chusohuu + '\'' +
                '}' ;
    }
}
