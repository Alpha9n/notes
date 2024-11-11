package local.hal.sa31.java.lesson1.ex4;

/**
 * SA31 Java文法 Lesson1 Ex4
 *
 * 実行クラス
 *
 * @author Shinzo SAITO
 */
public class CalcFromRadius {
    public static void main(String[] args) {
        double[] rList = { 1, 3, 5, 7, 9 };
        for(double radius: rList) {
            CalcCircleAndBall calc = new CalcCircleAndBall(radius);
            System.out.print("◼︎︎◼︎︎◼︎︎ 半径" + radius + "の計算結果");
            System.out.print("円周: " + calc.getRadius());
            System.out.print("｜円面積: " + calc.getArea());
            System.out.print("｜球面積: " + calc.getSurface());
            System.out.println("｜球体積: " + calc.getVolume());
        }
    }
}
