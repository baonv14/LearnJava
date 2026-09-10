import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnJava8 {
    public static void main(String[] args) {
        List<SinhVien> sinhViens = new ArrayList<>();
        sinhViens.add(new SinhVien("Bao",8,8));
        sinhViens.add(new SinhVien("Bao2",82,82));
        sinhViens.add(new SinhVien("Bao3",83,83));

        List<String> dsTenGiaiGioi = sinhViens.stream()
                .filter(sinhVien ->sinhVien.getDiemTB()>8)
                .map(sinhVien -> sinhVien.getHoTen().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Danh sách sinh vien Giỏi");
        dsTenGiaiGioi.forEach(dsTenGiai -> System.out.println(dsTenGiai));

    }
}
