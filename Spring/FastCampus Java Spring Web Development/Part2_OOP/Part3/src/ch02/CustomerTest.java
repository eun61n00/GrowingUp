package ch02;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("Lee");
        customerLee.setCustomerId(1001);
        customerLee.setBonusPoint(1000);
        System.out.println(customerLee.toString());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("Kim");
        customerKim.setCustomerId(1002);
        customerKim.setBonusPoint(50000);
        System.out.println(customerKim.toString());
    }
}
