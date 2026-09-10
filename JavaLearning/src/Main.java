//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*SinhVien sinhVien1 = new SinhVien("Maria Ozawa", 20,9.0);
        SinhVien sinhVien2 = new SinhVien("Tokuda", 80, 10.0);
        sinhVien1.hienThiThongTin();
        sinhVien1.setTuoi(200);
        sinhVien1.setDiemTB(20.0);
        sinhVien1.hienThiThongTin();*/
        //sinhVien2.hienThiThongTin();
        /*SanPham sp = new SanPham();
        sp.tenSP = "Laptop";
        sp.gia = 1500000000;
        sp.soLuong =2 ;
        sp.tinhTongTien();*/

        /*NhanVien nhanVien = new NhanVien("BaoNV14",5000);
        nhanVien.hienThiThongTin();

        System.out.println("+++++++++++++++++++++++++++");

        LapTrinhVien ltv = new LapTrinhVien("BaoNV14", 5000, 2000);
        ltv.hienThiThongTin();*/


       /* HinhChuNhat hcn = new HinhChuNhat(3,3);
        System.out.println("S: " + hcn.tinhDienTich());*/


        Thanhtoan payment = new ThanhToanMomo();
        payment.xulyThanhToan(99999);

        Thanhtoan payment2 = new ThanhToanBanking();
        payment2.xulyThanhToan(10000);




    }
}