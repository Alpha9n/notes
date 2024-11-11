package local.hal.sa31.java.lesson1.ex3;

/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * 名前と年齢を保持するクラス。
 *
 * @author Shinzo SAITO
 */
public class NameAndAge {
    /**
     * 名前を表すフィールド
     */
    public String name = "名無し";
    /**
     * 年齢を表すフィールド
     */
    public int age = -1;

    /**
     * 名前と年齢を表示するメソッド
     */
    public void show() {
        String printStr = name + "さんは";
        if (age == -1) {
            printStr += "年齢不詳です。";
        }
        else {
            printStr = printStr + age + "歳です。";
        }
        System.out.println(printStr);
    }
}
