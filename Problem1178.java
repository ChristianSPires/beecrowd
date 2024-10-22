import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double[] N = new double[100];

        for (int i = 0; i < N.length; i++) {
            N[i] = X / Math.pow(2, i);
        }

        IntStream.range(0, N.length)
                .forEach(i -> System.out.printf("N[%d] = %.4f%n", i, N[i]));
    }
}
