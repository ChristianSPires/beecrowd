import java.io.*;

public class Problem1534 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line.trim());

            if(N < 3 || N > 70) break;
            
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i + j == N - 1) {
                        matrix[i][j] = 2;
                    } else if (i == j) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 3;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(String.format("%d", matrix[i][j]));
                }
                sb.append("\n");
            }

            bw.write(sb.toString());
        }

        br.close();
        bw.close();
    }
}
