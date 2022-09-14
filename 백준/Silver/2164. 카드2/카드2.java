import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        IntStream.range(1, N + 1).forEach(queue::add);

        while (!queue.isEmpty()) {
            int data = queue.poll();
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            } else {
                bw.write(String.valueOf(data));
            }
        }
        bw.flush();
    }
}
