import java.util.Scanner;

public class Problem1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];

        int V = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            N[i] = (i == 0) ? V : N[i - 1] * 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}
