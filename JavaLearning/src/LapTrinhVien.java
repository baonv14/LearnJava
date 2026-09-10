public class LapTrinhVien extends NhanVien{
    private double tienBonus;

    public LapTrinhVien(String ten, double luongCoBan, double tienBonus) {
        super(ten,luongCoBan);
        this.tienBonus = tienBonus;
    }

    public double getTienBonus() {
        return tienBonus;
    }

    public void setTienBonus(double tienBonus) {
        this.tienBonus = tienBonus;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + this.tienBonus;
    }
}
