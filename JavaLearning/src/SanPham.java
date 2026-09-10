public class SanPham
{
    String tenSP;
    double gia;
    int soLuong;

    public void tinhTongTien(){
        System.out.println("Tổng tiền: " + gia * soLuong);
    }
}
