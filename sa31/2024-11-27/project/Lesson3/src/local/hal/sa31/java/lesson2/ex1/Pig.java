package local.hal.sa31.java.lesson2.ex1;

/**
 * SA31 Java文法 Lesson2 Ex1 Src4
 *
 * 豚を表すクラス
 *
 * @author Shinzo SAITO
 */
public class Pig extends Animal {
    @Override
    public String call() {
        return "ぶうぶう";
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("すばらしい！");
    }

    /**
     * 美味しいメソッド
     */
    public void eat() {
        System.out.println("うまい！");
    }
}
