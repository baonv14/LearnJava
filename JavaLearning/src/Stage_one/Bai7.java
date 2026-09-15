package Stage_one;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 130, 44, 3, 77, 12, 8);

        List<Integer> lonHon10 = numbers.stream()
                .filter(n -> n > 10)
                .toList();
        System.out.println(lonHon10);

        List<Integer> nhanDoiMoiSo = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(nhanDoiMoiSo);


        List<Integer> loaiTrung = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(loaiTrung);


        List<Integer> sapXep3sodau =  numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(sapXep3sodau);


        List<Integer> numbers2 = List.of(5, 12, 8, 130, 44, 3, 77, 12, 8);

        boolean coSoLon = numbers2.stream().anyMatch(n -> n > 100);
        System.out.println(coSoLon);
        boolean coSoAm = numbers2.stream().allMatch(n -> n > 0);
        System.out.println(coSoAm);
        Optional<Integer> soDauTien =  numbers2.stream().filter(n -> n > 40).findFirst();
        System.out.println("Số đầu tiên > 40: " + soDauTien.orElse(-1)); // 130


        IntSummaryStatistics stats = numbers2.stream().collect(Collectors.summarizingInt(n -> n));
        System.out.println("Tổng: "        + stats.getSum());
        System.out.println("Trung bình: "  + stats.getAverage());
        System.out.println("Max: "         + stats.getMax());
        System.out.println("Min: "         + stats.getMin());
        System.out.println("Số lượng: "    + stats.getCount());

     }
}
