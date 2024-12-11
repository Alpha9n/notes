package local.hal.sa31.java.lesson2.ex2;

/**
 * SA31 Java文法 Lesson2 Ex2 Src1
 *
 * 学生の英数国の成績情報を表すクラス
 *
 * @author Shinzo SAITO
 */
public class TestScore {
    /**
     * 名前を表すフィールド
     */
    private String _name;
    /**
     * 英語の点数を表すフィールド
     */
    private int _english;
    /**
     * 数学の点数を表すフィールド
     */
    private int _math;
    /**
     * 国語の点数を表すフィールド
     */
    private int _japanese;

    /**
     * フィールドにデータを格納するメソッド
     * @param name 名前
     * @param english 英語の点数
     * @param math 数学の点数
     * @param japanese 国語の点数
     */
    public void setData(String name, int english, int math, int japanese) {
        _name = name;
        _english = english;
        _math = math;
        _japanese = japanese;
    }

    /**
     * フィールドにデータを格納するメソッド
     * @param name 名前
     */
    public void setData(String name) {
        setData(name, 0, 0, 0);
    }

    /**
     * 合計点を表示するメソッド
     */
    public void print() {
        int sum = _english + _math + _japanese;
        System.out.println(_name + "さんの3教科合計点: " + sum);
    }
}
