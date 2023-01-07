package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        Customer customerA = new Customer(0, "customerA");
        Customer customerB = new Customer(1, "customerB");
        Customer customerC = new GoldCustomer(2, "customerC");
        Customer customerD = new GoldCustomer(3, "cutomerD");
        Customer customerE = new VIPCustomer(4, "customerE");

        customerArrayList.add(customerA);
        customerArrayList.add(customerB);
        customerArrayList.add(customerC);
        customerArrayList.add(customerD);
        customerArrayList.add(customerE);

        int price = 10000;
        for (Customer customer : customerArrayList) {
            System.out.print(customer.toString());
            System.out.println(" 지불 금액: " + customer.calcPrice(price) + ", 보너스 포인트: " + customer.getBonusPoint());
        }
    }

}
