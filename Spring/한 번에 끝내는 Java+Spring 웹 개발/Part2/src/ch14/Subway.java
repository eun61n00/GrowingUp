package ch14;

public class Subway {

    int subwayLine;
    int passengerCount;
    int income;

    public Subway(int subwayLine) {
        this.subwayLine = subwayLine;
    }

    public void take(int money) {
        this.passengerCount += 1;
        this.income += money;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "subwayLine=" + subwayLine +
                ", passengerCount=" + passengerCount +
                ", income=" + income +
                '}';
    }
}
