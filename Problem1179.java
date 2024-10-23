import java.util.Scanner;

public class Problem1179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] par = new int[5];
        int contPar = 0;
        int[] impar = new int[5];
        int contImpar = 0;

        for (int i = 0; i < 15; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                par[contPar] = x;
                contPar++;
            } else {
                impar[contImpar] = x;
                contImpar++;
            }

            if (contPar == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
                contPar = 0;
            }

            if (contImpar == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
                contImpar = 0;
            }
        }

        for (int j = 0; j < contImpar; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }

        for (int j = 0; j < contPar; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }
    }
}
