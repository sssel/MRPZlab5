import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Створення кошику товарів");
        Payment payment = new Payment();
        Payment.ShoppingCart shoppingCart = payment.new ShoppingCart();
        System.out.println("Введіть кількість товарів: ");
        shoppingCart.setNumberOfGoods(new Scanner(System.in).nextInt());
        System.out.println("Ви ввели "+shoppingCart.getNumberOfGoods()+", тому ціна кошику складає "+shoppingCart.getPrice());
        System.out.println("Знижка "+shoppingCart.getDiscount());
        System.out.println("Ціна кошику з урахуванням знижки "+shoppingCart.getTotalPayable());
        System.out.println("Створення платежу. Введіть адресу доставки: ");
        payment.setDeliveryAddress(new Scanner(System.in).nextLine());
        payment.setPaymentDate(Calendar.getInstance());
        System.out.println("Дата створення платежу: "+payment.getPaymentDate().getTime());
        System.out.println("Адреса доставки: "+payment.getDeliveryAddress());
        System.out.println("Оплата за доставку: "+payment.getShippingCost());
        System.out.println("Ціна кошика (з урахування знижки): "+shoppingCart.getTotalPayable());
        System.out.println("Всього до сплати: "+payment.getTotalPayable(shoppingCart));
    }
}