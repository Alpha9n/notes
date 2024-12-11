package local.hal.sa31.java.lesson2.ex1;

/**
 * SA31 Java文法 Lesson2 Ex1 Src1
 *
 * 動物を表すクラス
 *
 * @author Shinzo SAITO
 */
public class Animal {
    /**
     * その動物の愛称を表すフィールド
     */
    private String _name;

    /**
     * 愛称フィールドのセッタ
     * @param name 名前
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * 愛称フィールドのゲッタ
     * @return 名前
     */
    public String getName() {
        return _name;
    }

    /**
     * 鳴き声のメソッド
     * @return 鳴き声
     */
    public String call() {
        return "どんな鳴き声?";
    }

    /**
     * お話メソッド。意味不明
     */
    public void speak() {
        System.out.println("いえい！");
    }
}
