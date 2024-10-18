import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[100];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }

        IntStream.range(0, A.length)
                .filter(i -> A[i] <= 10)
                .forEach(i -> System.out.printf("A[%d] = %.1f\n", i, A[i]));
    }
}
