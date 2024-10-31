import java.util.Scanner;

public class Problem1186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] M = new float[12][12];
        float sum = 0;
        char O = Character.toUpperCase(sc.next().charAt(0));

        for(int row  = 0; row < 12; row++) {
            for(int col = 0; col < 12; col++) {
                M[row][col] = sc.nextFloat();
            }
        }

        for(int row = 0; row < 12; row++) {
            for(int col = 0; col < 12; col++) {
                if(row + col > 11) {
                    sum += M[row][col];
                }
            }
        }

        if(O == 'S') {
            System.out.printf("%.1f%n", sum);
        } else if(O == 'M') {
            System.out.printf("%.1f%n", sum / 66);
        }
    }
}
