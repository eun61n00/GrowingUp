package ch06;

public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        this.customerGrade = "Gold";
        this.salesRatio = 0.05;
        this.bonusRatio = 0.03;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

}
