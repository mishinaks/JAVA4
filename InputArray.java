import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число");
            nums[i] = in.nextDouble();
        }
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        double res = sum / size;
        for (double num : nums) {
            System.out.printf("%.3f * %.3f = %.3f ", num, res, num * res);
        }
    }
}
