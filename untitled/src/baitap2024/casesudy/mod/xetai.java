package baitap2024.casesudy.mod;

public class xetai extends xe{
    private float taitrong;
public xetai() {

}

    public xetai(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu, float taitrong) {
        super(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu);
        this.taitrong = taitrong;
    }

    public xetai(int taitrong) {
        this.taitrong = taitrong;
    }

    public float getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(int taitrong) {
        this.taitrong = taitrong;
    }

    @Override
    public String toString() {
        return "xetai{" +
                "taitrong=" + taitrong +
                "}\n thông tin xe: " + super.toString();
    }
}
