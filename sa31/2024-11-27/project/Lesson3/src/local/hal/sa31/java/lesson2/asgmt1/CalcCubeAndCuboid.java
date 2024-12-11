package local.hal.sa31.java.lesson2.asgmt1;

/**
 * SA31 課題3
 *
 * フィールドに格納された各辺の値をもとに表面積と体積を計算するクラス
 *
 * @author kosuke Jimbo
 */
public class CalcCubeAndCuboid {
    /**
     * 高さを表すフィールド
     */
    private double _height;
    /**
     * 幅(横の長さ)を表すフィールド
     */
    private double _width;
    /**
     * 奥行き(縦の長さ)を表すフィールド
     */
    private double _depth;

    /**
     * コンストラクタ
     * @param height 高さ
     * @param width 幅
     * @param depth 奥行き
     */
    public CalcCubeAndCuboid(double height, double width, double depth) {
        _height = height;
        _width = width;
        _depth = depth;
    }

    /**
     * コンストラクタ
     * @param side 1辺の長さ
     */
    public CalcCubeAndCuboid(double side) {
        this(side, side, side);
    }

    /**
     * 直方体、もしくは、立方体の表面積を取得するメソッド
     * @return 表面積
     */
    public double getArea() {
        return 2 * ( _height * _width + _height * _depth + _width * _depth );
    }

    /**
     * 直方体、もしくは、立方体の体積を取得するメソッド
     * @return 体積
     */
    public double getVolume() {
        return _height * _width * _depth;
    }
}
