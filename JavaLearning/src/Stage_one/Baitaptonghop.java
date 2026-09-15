package Stage_one;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Baitaptonghop {

    record Person(String name, int age, String city) {}
    public static void main(String[] args) {
        List<Person> persons =  List.of(
                new Person("An", 25, "Hà Nội"),
                new Person("Bình", 30, "Sài Gòn"),
                new Person("Cường", 25, "Hà Nội"),
                new Person("Dung", 35, "Sài Gòn"),
                new Person("En", 28, "Đà Nẵng")
        );


        List<String> tenNguoiLonHon20 = persons.stream()
                .filter(p->p.age > 20)
                .map(p->p.name)
                .toList();
        System.out.println(tenNguoiLonHon20);


        Map<String, List<Person>> map = persons.stream()
                .collect(Collectors.groupingBy(Person::city));
        System.out.println(map);

        Map<Boolean,List<Person>> chiaDoi = persons.stream()
                .collect(Collectors.partitioningBy(p->p.age >= 30));

        System.out.println(chiaDoi);

        Map<String, Long> demTheoTP = persons.stream()
                .collect(Collectors.groupingBy(Person::city, Collectors.counting()));

        System.out.println(demTheoTP);
    }
}
