/**
 * SA31 課題2
 * サポートJavaScriptクラス
 *
 * ガールフレンドを表すクラス
 *
 * @author Shinzo SAITO
 */
export default class GirlFriend {
    /**
     * @type {string} 名前を表すフィールド
     */
    #name;
    /**
     * @type {number} 誕生年を表すフィールド
     */
    #birthYear;
    /**
     * @type {number} 誕生月を表すフィールド
     */
    #birthMonth;
    /**
     * @type {number} 誕生日を表すフィールド
     */
    #birthDay;

    /**
     * コンストラクタ
     *
     * @param {string} name 名前
     * @param {number} birthYear 誕生年
     * @param {number} birthMonth 誕生月
     * @param {number} birthDay 誕生日
     */
    constructor(name, birthYear, birthMonth, birthDay) {
        this.#name = name;
        this.#birthYear = birthYear;
        this.#birthMonth = birthMonth;
        this.#birthDay = birthDay;
    }

    /**
     * 引数で渡された月が誕生月かどうかを判定するメソッド
     *
     * @param {number} month 判定に使われる月
     * @returns {boolean} 誕生月の場合はtrue、そうでない場合はfalse
     */
    isBirthMonth(month) {
        if (month === this.#birthMonth) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数で渡された年に何歳になるか計算するメソッド
     *
     * @param {number} year 計算の基となる年
     * @returns {number} 年齢
     */
    getAge(year) {
        return year - this.#birthYear;
    }

    /**
     * 名前フィールドのゲッタ
     * @returns {string} 名前
     */
    get name() {
        return this.#name;
    }

    /**
     * 誕生年フィールドのゲッタ
     * @returns {number} 誕生年
     */
    get birthYear() {
        return this.#birthYear;
    }

    /**
     * 誕生月フィールドのゲッタ
     * @returns {number} 誕生月
     */
    get birthMonth() {
        return this.#birthMonth;
    }

    /**
     * 誕生日フィールドのゲッタ
     * @returns {number} 誕生日
     */
    get birthDay() {
        return this.#birthDay;
    }
}