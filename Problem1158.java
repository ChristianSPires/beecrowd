import java.util.Scanner;

public class Problem1158 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int cont = 0, sum = 0;

            for (int j = X; cont < Y; j++) {
                if(j % 2 != 0) {
                    sum += j;
                    cont++;
                }
            }

            System.out.println(sum);
        }
    }
}
