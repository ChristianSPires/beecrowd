import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[20];

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int temp = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = temp;
        }

        IntStream.range(0, N.length)
                .forEach(i -> System.out.println("N[" + i + "] = " + N[i]));
    }
}
