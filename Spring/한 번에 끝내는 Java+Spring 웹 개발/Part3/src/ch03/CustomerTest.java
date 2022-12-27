package ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1001, "Lee");
        customerLee.setBonusPoint(1000);
        System.out.println(customerLee.toString());

        VIPCustomer customerNoName = new VIPCustomer();
        System.out.println(customerNoName.toString());

        VIPCustomer customerKim = new VIPCustomer(1002, "Kim");
        customerKim.setBonusPoint(50000);
        System.out.println(customerKim.toString());
    }
}
