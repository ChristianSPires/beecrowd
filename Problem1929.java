import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numerosRecebidos = new ArrayList<>();
        boolean possible = false;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        numerosRecebidos.add(a);
        numerosRecebidos.add(b);
        numerosRecebidos.add(c);
        numerosRecebidos.add(d);

        Collections.sort(numerosRecebidos);

        for (int i = 0; i < 2; i++) {
            if (numerosRecebidos.get(i) + numerosRecebidos.get(i + 1) > numerosRecebidos.get(i + 2)) {
                possible = true;
                break;
            }
        }

        if (possible) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
