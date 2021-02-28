import java.util.Scanner;
public class Constants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите константу X");
        String conx = in.nextLine();
        System.out.println("Введите константу Y");
        String cony = in.nextLine();
        System.out.println("Введите константу Z");
        String conz = in.nextLine();
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        in.nextLine();
        String[] nums = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение");
            nums[i] = in.nextLine();
        }
        for (int i = 0; i < size; i++) {
            if (nums[i].equals(conx) || nums[i].equals(cony) || nums[i].equals(conz) ) {
                System.out.println("Данное значение имеется в константах");
                return;
            }
        }
        System.out.println("Данных значений нет в константах");
    }
}
