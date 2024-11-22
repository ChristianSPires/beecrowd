import java.util.Scanner;

public class Problem1847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fd = sc.nextInt();
        int sd = sc.nextInt();
        int td = sc.nextInt();

        if(fd == sd) {
            if (td - sd > 0) System.out.println(":)");
            else System.out.println(":(");
        } else {
            if (fd > sd) {
                if ((sd - td) < (fd - sd)) {
                    System.out.println(":)");
                } else if ((sd - td) >= (fd - sd)) {
                    System.out.println(":(");
                } else {
                    System.out.println(":)");
                }
            } else {
                if ((td - sd) < (sd - fd)) {
                    System.out.println(":(");
                } else if ((td - sd) >=  (sd - fd)) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        }
    }
}
