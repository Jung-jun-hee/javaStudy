package staticex;

public class StudentStatic {

    private static int serialNum = 10000;

    int studentId;
    String studentName;

    public StudentStatic() {
        serialNum++;
        studentId = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        StudentStatic.serialNum = serialNum;
    }
}
