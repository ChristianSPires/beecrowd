import java.util.Scanner;

public class Problem1165 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int X = sc.nextInt();
            int sum = 0;

            for (int j = 1; j < X; j++) {
                if(X % j == 0) {
                    sum += j;
                }
            }

            if(sum > 1) System.out.println(X + " nao eh primo");
            else System.out.println(X + " eh primo");
        }
    }
}
