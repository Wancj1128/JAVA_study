package cn.edu.cqust.text1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Apple";
        phone.price = 7999.99;

        System.out.println("phone brand: " + phone.brand);
        System.out.println("phone price: " + phone.price);
        phone.call();
        phone.PlayGames();
    }
}
