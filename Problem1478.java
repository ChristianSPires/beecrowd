import java.io.*;

public class Problem1478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line.trim());

            if (N == 0) {
                break;
            }

            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    } else if (j > i) {
                        matrix[i][j] = j - i + 1;
                    } else {
                        matrix[i][j] = i - j + 1;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(String.format("%3d", matrix[i][j]));
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
