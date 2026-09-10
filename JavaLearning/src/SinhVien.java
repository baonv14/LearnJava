public class SinhVien
{
    private String hoTen;
    private int tuoi;
    private double diemTB;

        SinhVien(){
            System.out.println("Đã khởi tạo một sinh viên rỗng");
        }

        SinhVien(String hoTen,int tuoi,double diemTB){
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.diemTB = diemTB;
        }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 0 || tuoi >105){
            System.out.println("Tuổi không hợp lệ! Đặt mặc định là 18");
            this.tuoi = 18;
        }
        else{
            this.tuoi = tuoi;
        }

    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void hienThiThongTin(){
            System.out.println("Họ và tên: " + this.hoTen);
            System.out.println("Tuổi: " + this.tuoi);
            System.out.println("Điểm TB: " + this.diemTB);
        }
}
