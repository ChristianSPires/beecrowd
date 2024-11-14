import java.util.Scanner;

public class Problem1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSlugs;

        while (sc.hasNext()) {
            numSlugs = sc.nextInt();
            int highestVel = 0;

            for (int i = 0; i < numSlugs; i++) {
                int velSlug = sc.nextInt();

                if (velSlug > highestVel) highestVel = velSlug;
            }

            int velLevel = 0;
            if(highestVel < 10) {
                velLevel = 1;
            } else if (highestVel >= 10 && highestVel < 20) {
                velLevel = 2;
            } else if (highestVel >= 20) {
                velLevel = 3;
            }

            System.out.println(velLevel);
        }
        sc.close();
    }
}
