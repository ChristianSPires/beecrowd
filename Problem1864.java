import java.util.Scanner;

public class Problem1864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n;

        while (sc.hasNext()) {
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(sentence.charAt(i));
            }
            System.out.println();
        }

        sc.close();
    }
}
