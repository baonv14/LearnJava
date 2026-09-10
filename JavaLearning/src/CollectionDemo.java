import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        System.out.println("------------ArrayList----------");
        List<String> danhSachTen = new ArrayList<>();

        danhSachTen.add("Nguyễn Văn A");
        danhSachTen.add("Nguyễn Văn B");
        danhSachTen.add("Nguyễn Văn A");

        System.out.println("Số lượng phần tử: "+danhSachTen.size());
        System.out.println("Phần tư đầu tiên: "+danhSachTen.get(0));

        System.out.println("------------Danh sách tên----------");
        for(String ten : danhSachTen){
            System.out.println(ten);
        }


        System.out.println("------------SET----------");
        Set<String> emails = new HashSet<>();

        emails.add("nguyenvanbao@gmail.com");
        emails.add("tranthib@gmail.com");
        emails.add("nguyenvanbao@gmail.com");

        System.out.println("Số lượng Email:" + emails.size());
        for(String email: emails){
            System.out.println(email);
        }



        System.out.println("------------MAP----------");

        Map<String,String> danhba = new HashMap<>();

        danhba.put("111111111","Nguyễn A");
        danhba.put("99999999999","Nguyễn B");
        danhba.put("3333333333","Nguyễn AG");

        String nguoiSoHuu = danhba.get("111111111");
        System.out.println("Người sở hữu 111111111 là: " + nguoiSoHuu);

        for(Map.Entry<String, String > entry: danhba.entrySet()){
            System.out.println("Số điện thoại: "+ entry.getKey() + "là của " + entry.getValue());
        }

    }
}
