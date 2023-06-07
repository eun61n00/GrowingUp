package ch14;

public class Bus {

    int busNumber;
    int passengerCount;
    int income;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount += 1;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", passengerCount=" + passengerCount +
                ", income=" + income +
                '}';
    }
}
