package baitap2024.casesudy.model;

public class Motorcycle extends Truck {
    private float congxuat;
public Motorcycle() {

}

    public Motorcycle(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu, float congxuat) {
        super(bienkiemsoat, hangsanxuat, namsanxuat, chusohuu);
        this.congxuat = congxuat;
    }
    public void setCongxuat(int congxuat) {
        this.congxuat = congxuat;
    }

    @Override
    public String toString() {
        return "xe máy{" +
                "công xuất=" + congxuat +
                '}'+super.toString();
    }

    public float getCongxuat() {
        return congxuat;
    }
}
