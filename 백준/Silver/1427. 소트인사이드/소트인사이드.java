import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Integer> lists = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        input();
        solution();
        lists.forEach(System.out::print);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        char[] chars = N.toCharArray();
        for (char aChar : chars) {
            lists.add(aChar - '0');
        }
    }

    private static void solution() {
        lists.sort(((o1, o2) -> o2 - o1));
    }
}