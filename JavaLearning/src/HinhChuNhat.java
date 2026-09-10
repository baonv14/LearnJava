public class HinhChuNhat extends Hinhhoc{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        super("Hình Chữ Nhật");
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }
}
