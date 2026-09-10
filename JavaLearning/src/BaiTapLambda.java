import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BaiTapLambda {

    static class Product {
        String name ;
        double price;
        String category;

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String toString() {
            return name + " (" + price + ") " + category;
        }
    }

    public static List<Integer> locso(List<Integer> list, Predicate<Integer> dieukien)
    {
        List<Integer> ketQua = new ArrayList<>();
        for( Integer so: list){
            if(dieukien.test(so)){
                ketQua.add(so);
            }
        }
        return ketQua;
    }

    public static List<String> checkTen(List<String> list, Predicate<String> dieukien)
    {
        List<String> ketQua = new ArrayList<>();
        for(String ten : list){
            if(dieukien.test(ten)){
                ketQua.add(ten);
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
       List<Integer> dsSo = Arrays.asList(1,2,3,4,5,6,7,8,9,10,100);

        List<String> dsTen = Arrays.asList("Bắc","Bảo","Nam","Bình");

       List<Integer> dsSoChan = locso(dsSo,d -> d % 2 == 0);
       List<Integer> dsSoLonHon40 = locso(dsSo,d -> d > 40);

       System.out.println(dsSoLonHon40);
       System.out.println(dsSoChan);

       List<String> startB = checkTen(dsTen,d -> d.startsWith("B"));
       System.out.println(startB);


       List<Product> dsProd = Arrays.asList(
               new Product("Iphone 15",10000,"E"),
               new Product("Ipad 15",20000,"E"),
               new Product("Macbook",30000,"E"),
               new Product("Shirt",8000,"C")
       );

        List<Product> luxuryE =
                dsProd.stream().filter(product -> product.category.equals("E") && product.price>10000).collect(Collectors.toList());
        System.out.println(luxuryE);

    }
}
