import java.util.Scanner;

public class Problem1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            String mensagem = "";

            mensagem = (n != 0) ? "vai ter duas!" : "vai ter copa!";

            System.out.println(mensagem);
        }

        sc.close();
    }
}
