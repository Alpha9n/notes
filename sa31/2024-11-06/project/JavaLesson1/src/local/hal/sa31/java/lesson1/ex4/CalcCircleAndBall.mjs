/**
 * SA31 Java文法 Lesson1 Ex4
 *
 * 円球計算クラス
 *
 * @author Shinzo SAITO
 */
export default class CalcCircleAndBall {
    /**
     * 半径を表すプロパティ
     * @type {number}
     */
    radius = 0;
    /**
     * 円周率を表す定数プロパティ
     * @type {number}
     */
    #pi = 3.14;

    /**
     * コンストラクタ
     * @param radius {number} 半径
     */
    constructor(radius) {
        this.radius = radius;
    }

    /**
     * 円周を得るメソッド
     * @returns {number}
     */
    getCircle() {
        return 2 * this.#pi * this.radius;
    }

    /**
     * 円の面積を得るメソッド
     * @returns {number}
     */
    getArea() {
        return this.#pi * this.radius * this.radius;
    }

    /**
     * 球の表面積を得るメソッド
     * @returns {number}
     */
    getSurface() {
        return 4 * this.#pi * this.radius * this.radius;
    }

    /**
     * 球の体積を得るメソッド
     * @returns {number}
     */
    getVolume() {
        return 4 * this.#pi * this.radius * this.radius * this.radius / 3;
    }
}