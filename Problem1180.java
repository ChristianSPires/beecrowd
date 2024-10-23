import java.util.Scanner;

public class Problem1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int menor = Integer.MAX_VALUE;
        int posicao = -1;

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();

            if (X[i] < menor) {
                menor = X[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
