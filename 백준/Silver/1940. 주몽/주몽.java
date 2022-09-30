import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int startPoint = 0;
        int endPoint = N - 1;

        int count = 0;
        while(startPoint < endPoint) {
            if(array[startPoint] + array[endPoint] == M) {
                count++;
                startPoint++;
            } else if(array[startPoint] + array[endPoint] < M) {
                startPoint++;
            } else {
                endPoint--;
            }
        }
        System.out.println(count);
    }
}
