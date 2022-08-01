package thisex;

class Person{

    String name;
    int age;

    //생성자
    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1);
    }
}
