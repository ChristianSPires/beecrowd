import java.util.Scanner;

public class Problem1172 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];

        for (int i = 0; i < 10; i++) {

            if((X[i] = sc.nextInt()) <= 0) {
                X[i] = 1;
            }

            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
