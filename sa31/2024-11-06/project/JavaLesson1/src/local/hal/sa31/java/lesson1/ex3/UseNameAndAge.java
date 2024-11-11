package local.hal.sa31.java.lesson1.ex3;

/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * 実行クラス
 *
 * @author Shinzo SAITO
 */
public class UseNameAndAge {
    public static void main(String[] args) {
        NameAndAge nanashi = new NameAndAge();
        nanashi.show();
        NameAndAge taro = new NameAndAge();
        taro.name = "田中太郎";
        taro.age = 28;
        taro.show();
    }
}
