import java.util.Scanner;

public class Problem1160 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int populationA = sc.nextInt();
            int populationB = sc.nextInt();
            double growthRateA = sc.nextDouble() / 100;
            double growthRateB = sc.nextDouble() / 100;

            int years = 0;

            while (populationA <= populationB && years <= 100) {
                populationA += (int) (populationA * growthRateA);
                populationB += (int) (populationB * growthRateB);
                years++;
            }

            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }
        }

        sc.close();
    }
}
