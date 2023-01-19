package ch14;

public class Taxi {
    String companyName;
    int income;

    public Taxi(String companyName) {
        this.companyName = companyName;
    }

    public void take(int money) {
        this.income += money;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "companyName='" + companyName + '\'' +
                ", income=" + income +
                '}';
    }
}
