package coperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student s1 = new Student("jun",5000);

        Bus bus100 = new Bus(100);
        s1.takeBus(bus100);
        s1.showInfo();
        bus100.showInfo();

        Subway subway = new Subway(2);
        s1.takeSubway(subway);
        s1.showInfo();
        subway.showInfo();

    }
}
