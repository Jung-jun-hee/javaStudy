package thisex;

public class ThisExample {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        // 같은 클래스 내에서 멤버 변수를 가르키기 위해 this를 사용한다.
        // 자기 자신의 메모리를 가리킨다.
        this.year = year;
    }

    public void printThis() {
        // 현재 자기 자신의 주소값을 즉, 생성된 인스턴스의 주소값을 가르킨다.
        System.out.println(this);
    }

    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample();
        thisExample.setYear(10);

        thisExample.printThis();
    }
}
