package local.hal.sa31.java.lesson2.asgmt2;

public class ShowDonutsPrice {
    public static void main(String[] args) {
        Donuts oldDonuts = new Donuts("オールドファッション", 120, 3);
        DonutsWithDrink chocoDonuts = new DonutsWithDrink("チョコファッション", 140, 2, "アイスコーヒー", 350);

        oldDonuts.showOrder();
        chocoDonuts.showOrder();
    }
}
