public abstract class Hinhhoc {
    private String tenHinh;

    public Hinhhoc(String tenHinh) {this.tenHinh = tenHinh;}


    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract double tinhDienTich();
}
