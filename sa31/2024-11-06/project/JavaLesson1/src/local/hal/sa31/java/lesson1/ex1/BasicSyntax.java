package local.hal.sa31.java.lesson1.ex1;

/**
 * SA31 Java文法 Lesson1 Ex1
 *
 * 実行クラス
 *
 * @author Shinzo SAITO
 */
public class BasicSyntax {
    public static void main(String[] args) {
        int score = (int) Math.round(Math.random() * 100);
        System.out.println("あなたの点数: " + score);
        String msg;
        if (score >= 80) {
            msg = "優です。";
        }
        else if (score >= 70) {
            msg = "良です。";
        }
        else if (score >= 60) {
            msg = "可です。";
        }
        else {
            msg = "不可です。";
        }
        System.out.println(msg);
//        msg = 35;
    }
}
