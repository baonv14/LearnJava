package Stage_one;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main_StageOne {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        System.out.println("Số dư hiện tại: " + bankAccount.getBalance());;
//        bankAccount.deposit(100);
//        System.out.println("Số dư hiện tại: " + bankAccount.getBalance());;
//        bankAccount.withdraw(101);
//        System.out.println("Số dư hiện tại: " + bankAccount.getBalance());;

//        Animal[] animals = {new Dog(), new Cat(), new Dog()};
//        System.out.println(animals);
//
//        Arrays.stream(animals).toList().forEach(animal -> animal.makeSound());

            Shape hinhTron = new Circle(6);
            Shape hinhChuNhat = new Rectangle(3,2);

            hinhChuNhat.printArea();
            hinhTron.printArea();

        Predicate<Integer> isEven = n -> n % 2 == 0;



    }
}
