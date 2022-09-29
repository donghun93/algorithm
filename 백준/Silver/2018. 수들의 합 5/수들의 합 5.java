import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        int startIndex = 1;
        int endIndex = 1;

        int sum = 1;
        while (endIndex <= N) {
            if (sum == N) {
                cnt++;
                startIndex++;
                sum += startIndex;
            } else if (sum > N) {
                sum -= endIndex;
                endIndex++;
            } else {
                startIndex++;
                sum += startIndex;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
