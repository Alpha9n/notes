package local.hal.sa31.java.lesson2.asgmt1;

public class CalcFromOneEdge {
    private static double[] edges = {1.5, 3.2, 5.8, 7.4, 9.7,};
    public static void main(String[] args) {
        for (double edge: edges) {
            double width = edge*4;
            double depth = edge*8;
            CalcCubeAndCuboid oneEdge = new CalcCubeAndCuboid(edge);
            CalcCubeAndCuboid diffEdge = new CalcCubeAndCuboid(edge, width, depth);
            System.out.println("◼◼◼◼ 一辺" + edge + "の計算結果");
            System.out.println("立方体の表面積: " + oneEdge.getArea() + "｜体積: " + oneEdge.getVolume());
            System.out.println("横 " + width + " 奥行き " + depth + "の直方体の表面積: " + diffEdge.getArea() + "｜体積: " + diffEdge.getVolume());
        }
    }
}
