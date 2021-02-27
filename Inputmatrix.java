import java.util.Scanner;
public class Inputmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы");
        int columns = in.nextInt();
        System.out.println("Введите количество строк матрицы");
        int row = in.nextInt();
        double[][] nums = new double[row][columns];
        for (int i = 0; i < row; i++) {
            for (int a = 0; a < columns; a++) {
                System.out.println("Введите число");
                nums[i][a] = in.nextDouble();
            }
        }
        for (double num : nums[0]) {
            System.out.printf("%.2f * 3 = %.2f ", num, num * 3);
        }
    }
}
