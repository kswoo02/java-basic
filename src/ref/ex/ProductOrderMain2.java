package ref.ex;

import java.security.AllPermission;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productorder1 = new ProductOrder();
        productorder1.ProductName = "두부";
        productorder1.price = 2000;
        productorder1.quantity = 2;

        ProductOrder productorder2 = new ProductOrder();
        productorder2.ProductName = "김치";
        productorder2.price = 5000;
        productorder2.quantity = 1;

        ProductOrder productorder3 = new ProductOrder();
        productorder3.ProductName = "콜라";
        productorder3.price = 1500;
        productorder3.quantity = 2;

        ProductOrder[] productOrders = {productorder1, productorder2, productorder3};
        int totalPrice = 0;
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.ProductName + " 가격: " + p.price + " 수량:" +  p.quantity);
            totalPrice += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);

    }
}
