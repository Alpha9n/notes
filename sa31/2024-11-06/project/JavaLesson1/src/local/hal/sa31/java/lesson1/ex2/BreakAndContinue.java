package local.hal.sa31.java.lesson1.ex2;

/**
 * SA31 Java文法 Lesson1 Ex2
 *
 * 実行クラス
 *
 * @author Shinzo SAITO
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        int[] numes = new int[5];
        int[] denomis = new int[5];
        for (int i = 0; i < 4; i++) {
            numes[i] = (int) Math.round(Math.random() * 10);
            denomis[i] = (int) Math.round(Math.random() * 10);
        }

        for (int denomi: denomis) {
            System.out.println("◼︎分母の値: " + denomi);
            if (denomi == 0) {
                System.out.println("分母が0なので処理を中止します");
                continue;
            }
            for (int nume: numes) {
                System.out.println("--分子の値: " + nume);
                if (nume == 0) {
                    System.out.println("→分子が0なので次の分子にスキップします");
                    continue;
                }
                double ans = (double) nume / denomi;
                System.out.println("→分数値: " + ans);
            }
        }
    }
}
