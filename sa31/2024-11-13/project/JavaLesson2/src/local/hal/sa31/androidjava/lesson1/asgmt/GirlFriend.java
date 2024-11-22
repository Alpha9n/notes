package local.hal.sa31.androidjava.lesson1.asgmt;

/**
 * SA31 課題2
 * サポートJavaクラス
 *
 * ガールフレンドを表すクラス
 *
 * @author Kosuke Jimbo
 */
public class GirlFriend {
    private final String _name;
    private final int _birthYear;
    private final int _birthMonth;
    private final int _birthDay;

    /**
     * コンストラクタ
     *
     * @param name 名前
     * @param birthYear 誕生年
     * @param birthMonth 誕生月
     * @param birthDay 誕生日
     */
    GirlFriend(String name, int birthYear, int birthMonth, int birthDay) {
        _name = name;
        _birthYear = birthYear;
        _birthMonth = birthMonth;
        _birthDay = birthDay;
    }

    /**
     * 引数で渡された月が誕生月かどうかを判定するメソッド
     *
     * @param month 判定に使われる月
     * @return 誕生月の場合はtrue、そうでない場合はfalse
     */
    public Boolean isBirthMonth(int month) {
        if (month == _birthMonth) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数で渡された年に何歳になるか計算するメソッド
     *
     * @param year 計算の基となる年
     * @return 年齢
     */
    public int getAge(int year) {
        return year - _birthYear;
    }

    /**
     * 名前フィールドのゲッタ
     */
    public String getName() {
        return _name;
    }

    /**
     * 誕生年フィールドのゲッタ
     */
    public int getBirthYear() {
        return _birthYear;
    }

    /**
     * 誕生月フィールドのゲッタ
     */
    public int getBirthMonth() {
        return _birthMonth;
    }

    /**
     * 誕生日フィールドのゲッタ
     */
    public int getBirthDay() {
        return _birthDay;
    }
}
