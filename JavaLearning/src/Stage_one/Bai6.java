package Stage_one;

public class Bai6 {
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args){
        Calculator cong = ((a, b) ->  a + b);
        Calculator tru = ((a, b) ->  a - b);
        Calculator nhan = ((a, b) ->  a * b);
        Calculator chia = ((a, b) ->  a / b);

        System.out.println(cong.calculate(2, 3));
        System.out.println(tru.calculate(2, 3));
        System.out.println(nhan.calculate(2, 3));
        System.out.println(chia.calculate(2, 3));
    }

}
