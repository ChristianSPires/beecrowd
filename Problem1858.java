import java.util.Scanner;

public class Problem1858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menorHits = Integer.MAX_VALUE;
        int menorNumero = -1;

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();

            if (t < menorHits) {
                menorHits = t;
                menorNumero = i;
            }
        }

        System.out.println(menorNumero);
    }
}
