package baitap2024.casestudy_mvc.model;

public class Vehicle extends Truck {
    private float taitrong;
public Vehicle() {

}

    public Vehicle(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu, float taitrong) {
        super(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu);
        this.taitrong = taitrong;
    }

    public Vehicle(int taitrong) {
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
