package ch15;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();
    }

}