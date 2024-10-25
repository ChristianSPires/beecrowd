import java.util.Scanner;

public class Problem1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] matrix = new float[12][12];
        float sum = 0;

        int n = sc.nextInt();
        char operation = Character.toUpperCase(sc.next().charAt(0));

        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                matrix[row][col] = sc.nextFloat();
            }
        }

        for (int col = 0; col < 12; col++) {
            sum += matrix[n][col];
        }

        if (operation == 'S') {
            System.out.printf("%.1f%n", sum);
        } else if (operation == 'M') {
            System.out.printf("%.1f%n", sum / 12);
        }
    }
}
