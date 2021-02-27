import java.util.Scanner;
public class ОddNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input num:");
        int n = in.nextInt();
        int odd = 1;
        int sum = 0;
        while (n >= odd){
            sum = sum + odd;
            odd += 2;
        }
        System.out.println(sum);
    }
}
