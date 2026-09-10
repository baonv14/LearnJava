import java.util.*;
import java.util.function.Predicate;

public class BaiTapLambda {

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
    }
}
