import java.util.Scanner;

public class Problem1914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String nome1 = sc.next();
            String resposta1 = sc.next();
            String nome2 = sc.next();
            String resposta2 = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            if (sum % 2 == 0) {
                if (resposta1.equals("PAR")) System.out.println(nome1);
                else System.out.println(nome2);
            } else {
                if (resposta1.equals("IMPAR")) System.out.println(nome1);
                else System.out.println(nome2);
            }
        }

        sc.close();
    }
}
