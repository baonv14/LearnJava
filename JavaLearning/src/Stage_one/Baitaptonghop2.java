package Stage_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Baitaptonghop2 {

    record Item(String name, String category, double price, int quantity){};
    record Order(String customer, String city, List<Item> items) {};
    public static void main(String[] args) {


        List<Order> orders = List.of(
                new Order("An", "Hà Nội", List.of(
                        new Item("Laptop", "Điện tử", 1500, 1),
                        new Item("Chuột", "Điện tử", 20, 2)
                )),
                new Order("Bình", "Sài Gòn", List.of(
                        new Item("Sách Java", "Sách", 30, 3),
                        new Item("Bút", "Văn phòng", 5, 10)
                )),
                new Order("An", "Hà Nội", List.of(
                        new Item("Bàn phím", "Điện tử", 80, 1),
                        new Item("Sách SQL", "Sách", 25, 2)
                )),
                new Order("Cường", "Đà Nẵng", List.of(
                        new Item("Màn hình", "Điện tử", 300, 2)
                ))
        );

        List<Item> tatCaItem = orders.stream()
                .flatMap(o->o.items().stream())
                .collect(Collectors.toList());
        System.out.println("Danh sách tất cả Item");
        tatCaItem.forEach(System.out::println);

        System.out.println("Các category duy nhất, từ A-Z");

        List<String> categoryDuyNhat = orders.stream()
                .flatMap(o->o.items().stream())
                .map(Item::category)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        categoryDuyNhat.forEach(System.out::println);


        System.out.println("Tổng giá trị");
        double tongDoanhThu = orders.stream()
                .flatMap(o->o.items().stream())
                .mapToDouble(i->i.quantity * i.price())
                .sum();
        System.out.println("Tổng giá trị các item: " + tongDoanhThu);


        System.out.println("Tổng chi tiêu của mỗi khách hàng");

        Map<String, Double> chiTieuMoiKhachHang = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::customer,
                        Collectors.summingDouble(
                                o->o.items()
                                        .stream()
                                        .mapToDouble(i -> i.price* i.quantity).sum())
                        )
                );
        System.out.println("4. Chi tiêu/khách: " + chiTieuMoiKhachHang);

    }

}
