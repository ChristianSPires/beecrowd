import java.util.Objects;
import java.util.Scanner;

public class Problem1865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i = 1; i <= C; i++) {
            String name = sc.next();
            int force = sc.nextInt();

            if (!Objects.equals(name, "Thor")) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }
        }
    }
}
