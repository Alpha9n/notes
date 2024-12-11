package local.hal.sa31.java.lesson2.asgmt2;

public class DonutsWithDrink extends Donuts {
    /**
     * ドリンクの名前
     */
    private final String _drinkName;
    /**
     * ドリンクの価格
     */
    private final int _drinkPrice;

    /**
     * コンストラクタ
     * @param name     ドーナツの名前
     * @param price    ドーナツの単価
     * @param quantity ドーナツの量
     */
    public DonutsWithDrink(String name, int price, int quantity, String drinkName, int drinkPrice) {
        super(name, price, quantity);
        _drinkName = drinkName;
        _drinkPrice = drinkPrice;
    }

    /**
     * ドリンク代も含めた金額を得るメソッド
     * @return ドリンク代+ドーナツ代
     */
    public int getPriceWithDrink() {
        return _drinkPrice + getTotalDonutsPrice();
    }

    /**
     * 注文したドーナツとドリンクのセット価格を表示するメソッド
     */
    public void showOrder() {
        super.showOrder();
        System.out.println("ドーナツと" + _drinkName + "のセットで合計" + getPriceWithDrink() + "円");
    }
}
