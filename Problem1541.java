import java.io.*;
import java.util.Scanner;

public class Problem1541 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();

            if (a == 0) break;

            int b = sc.nextInt();

            if (b == 0) break;

            int c = sc.nextInt();

            if (c == 0) break;

            int area = a * b;

            float allowPercentage = c / 100.0f;

            float landArea = area / allowPercentage;

            int landSize = (int) Math.sqrt(landArea);

            System.out.println(landSize);
        }

        sc.close();
    }
}
