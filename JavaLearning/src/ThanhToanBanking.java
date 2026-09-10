public class ThanhToanBanking implements Thanhtoan {
    @Override
    public void xulyThanhToan(double soTien) {
        System.out.println("Xử lý chuyển khoản " + soTien + "VNĐ qua Internet Banking");
    }
}
