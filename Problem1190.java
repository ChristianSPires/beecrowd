import java.util.Scanner;

public class Problem1190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] M = new double[4][4];
        double sum = 0;

        char O = Character.toUpperCase(sc.next().charAt(0));

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                M[row][col] = sc.nextDouble();
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if(col > row && row + col > 3) {
                    sum += M[row][col];
                }
            }
        }

        if(O == 'M') sum /= 30;
        System.out.printf("%.1f%n", sum);
    }
}
