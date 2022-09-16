import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        input();
        solution();
        print();
    }
    private static void input() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0;i<N;i++) {
            list.add(scanner.nextInt());
        }
    }
    private static void solution() {
        list.sort((o1, o2) -> o1 - o2);
    }

    private static void print() {
        list.forEach(System.out::println);
    }
}
