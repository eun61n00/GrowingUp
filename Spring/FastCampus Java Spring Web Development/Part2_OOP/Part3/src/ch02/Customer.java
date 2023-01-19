package ch02;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
        System.out.println("Customer() called");
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public int calcPrice(int price) {
        this.bonusPoint += price * bonusRatio;
        return price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", custormerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusRatio=" + bonusRatio +
                '}';
    }
}
