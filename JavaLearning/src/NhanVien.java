import java.sql.SQLOutput;

public class NhanVien {
    private String ten;
    private double luongCoBan;

    public NhanVien(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }

    public void hienThiThongTin(){
        System.out.println("Nhân viên: " + this.ten + " | Lương: " + this.tinhLuong());
    }

}
