package baitap2024.casesudy.mod;

public class oto extends xe {
    private int socho;
    private String kieuxe;
public oto(){
}
    public oto(String bienkiemsoat, String hangsanxuat, int namsanxuat, String chusohuu, int socho, String kieuxe) {
        super(bienkiemsoat,hangsanxuat,namsanxuat,chusohuu);
        this.socho = socho;
        this.kieuxe = kieuxe;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }

    @Override
    public String toString() {
        return "oto{" +
                "socho=" + socho +
                ", kieuxe='" + kieuxe + '\'' +
                "} " + super.toString();
    }
}

