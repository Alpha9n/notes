/**
 * SA31 Java文法 Lesson1 Ex4
 *
 * JavaScript実行ファイル
 *
 * @author Shinzo SAITO
 */
import CalcCircleAndBall from "./CalcCircleAndBall.mjs";

const rList = [1, 3, 5, 7, 9];
for(const radius of rList) {
    const calc = new CalcCircleAndBall(radius);
    console.log(`◼︎◼︎◼︎ 半径${radius}の計算結果`);
    console.log(`円周: ${calc.getCircle()}`);
    console.log(`｜円面積: ${calc.getArea()}`);
    console.log(`｜球面積: ${calc.getSurface()}`);
    console.log(`｜球体積: ${calc.getVolume()}`);
}