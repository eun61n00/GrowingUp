package ch14;

public class TakeTrans {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway(2);
        Taxi taxi = new Taxi("잘나간다운수");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subway2);
        studentE.takeTaxi(taxi);

        System.out.println(studentJ.toString());
        System.out.println(studentT.toString());
        System.out.println(studentE.toString());

        System.out.println(bus100.toString());
        System.out.println(subway2.toString());
        System.out.println(taxi.toString());

    }
}
