import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[1000];
        int T = sc.nextInt();

        for (int i = 0; i < N.length; i++) {
            N[i] = i % T;
        }
        IntStream.range(0, N.length)
                .forEach(i -> System.out.println("N[" + i + "] = " + N[i]));
    }
}
