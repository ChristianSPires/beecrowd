import java.util.Scanner;

public class Problem1866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            if (n % 2 != 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
