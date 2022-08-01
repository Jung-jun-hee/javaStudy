package coperation;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takeSubway(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println("Subway" + lineNumber+ "gest" + passengerCount + " and" + money);
    }
}
