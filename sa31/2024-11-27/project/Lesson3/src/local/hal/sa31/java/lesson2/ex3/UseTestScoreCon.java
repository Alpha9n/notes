package local.hal.sa31.java.lesson2.ex3;

public class UseTestScoreCon {
    public static void main(String[] args) {
        TestScoreCon student = new TestScoreCon("太郎");
        student.print();
        student = new TestScoreCon("花子", 92, 78, 89);
        student.print();
    }
}
