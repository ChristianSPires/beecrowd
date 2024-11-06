import java.io.*;

public class Problem1435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line.trim());

            if (N == 0) {
                break;
            }

            int[][] array = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = Math.min(Math.min(i, j), Math.min(N - 1 - i, N - 1 - j)) + 1;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(String.format("%3d", array[i][j]));
                    if (j < N - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

            sb.append("\n");

            bw.write(sb.toString());
        }

        br.close();
        bw.close();
    }
}
