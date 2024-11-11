package local.hal.sa31.java.lesson1.ex4;

/**
 * SA31 Java文法 Lesson1 Ex4
 *
 * 円球計算クラス
 *
 * @author Shinzo SAITO
 */
public class CalcCircleAndBall {
    /**
     * 半径を表すフィールド
     */
    private double _radius = 0;
    /**
     * 円周率を表す定数フィールド
     */
    private static final double PI = 3.14;

    /**
     * コンストラクタ
     * @param radius 半径
     */
    public CalcCircleAndBall(double radius) {
        _radius = radius;
    }

    /**
     * 半径を得るメソッド
     * @return 半径
     */
    public double getRadius() {
        return _radius;
    }

    /**
     * 円周を得るメソッド
     * @return 計算された円周
     */
    public double getCircle() {
        return 2 * PI * _radius;
    }

    /**
     * 円の面積を得るメソッド
     * @return 計算された円の面積
     */
    public double getArea() {
        return PI * _radius * _radius;
    }

    /**
     * 球の表面積を得るメソッド
     * @return 計算された球の表面積
     */
    public double getSurface() {
        return 4 * PI * _radius * _radius;
    }

    /**
     * 球の体積を得るメソッド
     * @return 計算された球の体積
     */
    public double getVolume() {
        return 4 * PI * _radius * _radius * _radius / 3;
    }
}
