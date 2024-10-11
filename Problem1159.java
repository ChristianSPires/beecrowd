import java.util.Scanner;

public class Problem1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 0;

        while ((X = sc.nextInt()) != 0) {
            int sum = 0;
            int count = 0;
            for (int i = X; count < 5; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    count++;
                }
            }
            System.out.println(sum);
        }
    }
}
