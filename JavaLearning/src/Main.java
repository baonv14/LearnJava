import java.util.*;
import java.util.stream.Collectors;

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


//        Thanhtoan payment = new ThanhToanMomo();
//        payment.xulyThanhToan(99999);
//
//        Thanhtoan payment2 = new ThanhToanBanking();
//        payment2.xulyThanhToan(10000);


        List<Product> productList = Arrays.asList(
                new Product(1, "iPhone 15 Pro", "Điện thoại", 28000000, 10),
                new Product(2, "Samsung Galaxy S24", "Điện thoại", 22000000, 5),
                new Product(3, "MacBook Pro M3", "Laptop", 45000000, 3),
                new Product(4, "Dell XPS 15", "Laptop", 38000000, 0), // Hết hàng
                new Product(5, "iPad Air 5", "Máy tính bảng", 15000000, 8),
                new Product(6, "Chuột Logistics MX Master 3S", "Phụ kiện", 2500000, 20),
                new Product(7, "Bàn phím Keychron K2", "Phụ kiện", 1800000, 0) // Hết hàng)
        );


        System.out.println("----------------B1---------------");
        List<Product> dienThoaiConHang = productList.stream().filter(product -> product.getStock() > 0 && product.getCategory().equals("Điện thoại")).toList();
        System.out.println(dienThoaiConHang.size());
        System.out.println(dienThoaiConHang);

        System.out.println("----------------B2---------------");

//        List<String> tenUpper_SortAsc = new ArrayList<>();
//        for  (Product product : productList) {
//
//        }

        List<String> tenUpper_SortAsc = productList.stream()
                .sorted((p1,p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .map(product -> product.getName().toUpperCase())
                .toList();

        tenUpper_SortAsc.forEach(name->System.out.println(name));

        System.out.println("----------------B3---------------");


        Double tongTien =  productList.stream()
                .mapToDouble(product -> product.getPrice() * product.getStock())
                .sum();
        System.out.printf("Tổng giá trị hàng tồn kho: %,.0f VNĐ\n", tongTien);


        System.out.println("----------------B4---------------");




        Product spDatnhat = productList.stream()
                .filter(product -> product.getCategory().equals("Laptop"))
                .max((p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .orElse(new Product(0,"Laptop mặc định","Laptop",0,0));

        System.out.println(spDatnhat);

        System.out.println("----------------B5---------------");

        Map<String, List<Product>>  nhomTheoDanhMuc = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        nhomTheoDanhMuc.forEach((k,v)->{
            System.out.println("\n=== DANH MUC: " + k + "====");
            v.forEach(product -> System.out.println(product.getName()));
        });

        System.out.println("----------------B6---------------");

        Map<Integer,String>  mapIdVaTen = productList.stream()
                .collect(Collectors.toMap(Product::getId, Product::getName));

        mapIdVaTen.forEach((i,s)-> System.out.println("Key: " + i + " Value: " + s));

        System.out.println("----------------B7---------------");


        List<Product> dsSP_Order = productList.stream()
                .sorted(
                        Comparator.comparing(Product::getCategory)
                                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                )
                .toList();


        dsSP_Order.forEach(p ->
                System.out.printf("[%s] %s - %,.0f VNĐ\n", p.getCategory(), p.getName(), p.getPrice())
        );

        System.out.println("----------------B8---------------");

        Map<Boolean, List<Product>>  nhomHangTon = productList.stream()
                .collect(Collectors.partitioningBy(product -> product.getStock() >0));

        List<Product> dsConHang = nhomHangTon.get(true);
        List<Product> dsHetHang = nhomHangTon.get(false);

        System.out.println("---------Số sản phẩm CÒN HÀNG: " + dsConHang.size());
        dsConHang.forEach(product -> System.out.println(product.getName()));
        System.out.println("---------Số sản phẩm HẾT HÀNG: " + dsHetHang.size());
        dsHetHang.forEach(product -> System.out.println(product.getName()));


    }

}