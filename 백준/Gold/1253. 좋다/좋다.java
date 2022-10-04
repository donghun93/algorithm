import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int[] array;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
    }

    private static int solution() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            int k = array[i];
            int start = 0;
            int end = N - 1;

            while (start < end) {
                if (array[start] + array[end] == k) {
                    if(start != i && end != i) {
                        count++;
                        break;
                    } else if(start == i) {
                        start++;
                    } else {
                        end--;
                    }

                } else if (array[start] + array[end] > k) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return count;
    }
}