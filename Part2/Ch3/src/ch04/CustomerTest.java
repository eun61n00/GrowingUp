package ch04;

public class CustomerTest {
    public static void main(String[] args) {
        
        Customer customerLee = new Customer(1001, "Lee");
        customerLee.setBonusPoint(1000);
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.getCustomerName() + ": " + price);

        
        VIPCustomer customerKim = new VIPCustomer(1002, "Kim");
        customerKim.setBonusPoint(50000);
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.getCustomerName() + ": " + price);

        Customer customerPark = new VIPCustomer(1000, "Park");
        System.out.println(customerPark.getCustomerName() + ": " + customerPark.calcPrice(1000));
    }
}
