package local.hal.sa31.java.lesson2.ex3;

/**
 * SA31 Java文法 Lesson2 Ex2 Src1
 *
 * 学生の英数国の成績情報を表すクラス
 *
 * @author Shinzo SAITO
 */
public class TestScoreCon {
    /**
     * 名前を表すフィールド
     */
    protected String _name;
    /**
     * 英語の点数を表すフィールド
     */
    protected int _english;
    /**
     * 数学の点数を表すフィールド
     */
    protected int _math;
    /**
     * 国語の点数を表すフィールド
     */
    protected int _japanese;

    /**
     * コンストラクタ
     * @param name 名前
     * @param english 英語の点数
     * @param math 数学の点数
     * @param japanese 国語の点数
     */
    public TestScoreCon(String name, int english, int math, int japanese) {
        _name = name;
        _english = english;
        _math = math;
        _japanese = japanese;
    }

    /**
     * コンストラクタ
     * @param name 名前
     */
    public TestScoreCon(String name) {
        this(name, 0, 0, 0);
    }

    /**
     * 合計点を表示するメソッド
     */
    public void print() {
        int sum = _english + _math + _japanese;
        System.out.println(_name + "さんの3教科合計点: " + sum);
    }
}
