import java.util.*;

public class Problem1828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        Map<String, Set<String>> vence = new HashMap<>();

        vence.put("pedra", new HashSet<>(Arrays.asList("lagarto", "tesoura")));
        vence.put("papel", new HashSet<>(Arrays.asList("pedra", "Spock")));
        vence.put("tesoura", new HashSet<>(Arrays.asList("papel", "lagarto")));
        vence.put("lagarto", new HashSet<>(Arrays.asList("Spock", "papel")));
        vence.put("Spock", new HashSet<>(Arrays.asList("tesoura", "pedra")));

        for (int i = 1; i <= T; i++) {
            String sheldonHand = sc.next();
            String rajHand = sc.next();

            if (sheldonHand.equals(rajHand)) {
                System.out.println("Caso #" + i + ": De novo!");
            } else {
                if (vence.get(sheldonHand).contains(rajHand)) {
                    System.out.println("Caso #" + i + ": Bazinga!");
                } else {
                    System.out.println("Caso #" + i + ": Raj trapaceou!");
                }
            }
        }

        sc.close();
    }
}
