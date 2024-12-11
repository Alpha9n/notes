package local.hal.sa31.java.lesson2.ex2;

/**
 * SA31 Java文法 Lesson2 Ex2 Src2
 *
 * 実行クラス
 *
 * @author Shinzo SAITO
 */
public class UseTestScore {
    public static void main(String[] args) {
        TestScore student = new TestScore();
        student.setData("太郎");
        student.print();
        student.setData("花子", 92, 78, 89);
        student.print();
    }
}
