package baitap2024.thi.mod;

public class QuanLy {
    private String sdt;
    private int nhomdanhba;
    private String hovaten;
    private String gioitinh;
    private String diachi;
    private String ngaysinh;
    private String email;

    public QuanLy() {

    }

    public QuanLy(String sdt, int nhomdanhba, String hovaten, String gioitinh, String diachi, String ngaysinh, String email) {
        this.sdt = sdt;
        this.nhomdanhba = nhomdanhba;
        this.hovaten = hovaten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getNhomdanhba() {
        return nhomdanhba;
    }

    public void setNhomdanhba(int nhomdanhba) {
        this.nhomdanhba = nhomdanhba;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Quản lý{" +
                "SDT=" + sdt +
                ", Nhóm danh bạ=" + nhomdanhba +
                ", Họ và tên='" + hovaten + '\'' +
                ", giới tính='" + gioitinh + '\'' +
                ", Địa chỉ='" + diachi + '\'' +
                ", Ngày sinh='" + ngaysinh + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}