package ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    String agentId;

    public VIPCustomer() {
        super(0, "no-name");
        this.customerGrade = "VIP";
        this.salesRatio = 0.1;
        this.bonusRatio = 0.05;
        System.out.println("VIPCustomer() called");
    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        this.customerGrade = "VIP";
        this.salesRatio = 0.1;
        this.bonusRatio = 0.05;
        System.out.println("VIPCustomer(int, String) called");
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "salesRatio=" + salesRatio +
                ", agentId='" + agentId + '\'' +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusRatio=" + bonusRatio +
                '}';
    }
}
