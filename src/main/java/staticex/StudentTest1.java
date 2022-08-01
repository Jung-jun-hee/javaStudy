package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        // new 로 인스턴스를 생성할 때 마다 자동으로 숫자가 기입되고 싶을 때 static 사용(공유값 활용)
        StudentStatic s1 = new StudentStatic();

        // 여기서 클래스 변수를 증가시켜보면
        StudentStatic s2 = new StudentStatic();

        // 생성된 두 인스턴스 모두 같은 값을 공유할 수 있는 걸 확인할 수 있다.
        System.out.println(StudentStatic.getSerialNum());

    }
}
