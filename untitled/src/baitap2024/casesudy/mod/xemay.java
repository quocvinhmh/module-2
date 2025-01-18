package baitap2024.casesudy.mod;

public class xemay extends xe {
    private float congxuat;
public xemay() {

}

    public xemay(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu, float congxuat) {
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
