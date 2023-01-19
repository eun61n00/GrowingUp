package ch02;

public class VIPCustomer extends Customer {

    double salesRatio;
    String agentId;

    public VIPCustomer() {
        this.customerGrade = "VIP";
        this.salesRatio = 0.1;
        System.out.println("VIPCustomer() called");
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
