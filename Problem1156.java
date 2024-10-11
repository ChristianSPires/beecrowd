public class Problem1156 {
    public static void main(String[] args) {

        double S = 0, cont = 1;

        for(int i = 1; i <= 39; i+=2){
            if (i == 1) {
                S += 1;
                continue;
            }
            cont *= 2;

            S += i / cont;
        }

        System.out.printf("%.2f%n", S);

    }
}
