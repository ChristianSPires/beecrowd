import java.util.Scanner;

public class Problem1848 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cawCount = 0;
        String blink;
        int sum = 0;

        while(cawCount < 3) {
            blink = sc.nextLine();

            if (blink.equals("caw caw")) {
                System.out.println(sum);
                sum = 0;
                cawCount++;
                continue;
            }

            for (int i = 0; i < blink.length(); i++) {
                if (blink.charAt(i) == '*' && i == 0) {
                    sum += 4;
                } else if (blink.charAt(i) == '*' && i == 1) {
                    sum += 2;
                } else if (blink.charAt(i) == '*' && i == 2) {
                    sum += 1;
                }
            }
        }
    }
}
