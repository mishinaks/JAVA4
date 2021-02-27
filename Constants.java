import java.util.Scanner;
public class Constants {
    public static void main(String[] args) {
        int x = 3;
        int y = 21;
        int z = 13;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число");
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == x ||  nums[i] == y ||  nums[i] == z ) {
                System.out.println("Данное значение имеется в константах");
                return;
            }
        }
        System.out.println("Данных значений нет в константах");
    }
}
