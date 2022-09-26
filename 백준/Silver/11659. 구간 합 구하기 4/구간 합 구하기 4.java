import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // 3

        long[] sum = new long[N + 1]; // 6

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sum[i] += sum[i - 1] + Long.parseLong(st.nextToken());
        }

         for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken()); // 1
            int l = Integer.parseInt(st.nextToken()); // 3

            sb.append(sum[l] - sum[f - 1]).append('\n');
        }
        System.out.println(sb.toString());
    }
}
