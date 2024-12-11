package local.hal.sa31.java.lesson2.asgmt2;

public class Donuts {
    /**
     * ドーナツの名前
     */
    private final String _name;
    /**
     * ドーナツの単価
     */
    private final int _price;
    /**
     * ドーナツの量
     */
    private int _quantity;

    /**
     * コンストラクタ
     * @param name ドーナツの名前
     * @param price ドーナツの単価
     * @param quantity ドーナツの量
     */
    public Donuts(String name, int price, int quantity) {
        _name = name;
        _price = price;
        _quantity = quantity;
    }

    /**
     * 注文したドーナツの合計金額を得る
     * @return 注文したドーナツの合計金額
     */
    public int getTotalDonutsPrice() {
        return _price * _quantity;
    }

    /**
     * 注文したドーナツのレシートを出力する
     */
    public void showOrder() {
        System.out.println(_name + "が" + _quantity + "個で合計" + this.getTotalDonutsPrice() + "円");
    }
}
