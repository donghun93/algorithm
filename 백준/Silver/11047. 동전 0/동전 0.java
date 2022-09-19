import java.util.Scanner;

public class Main {
    private static int[] array;
    private static int A = 0;

    public static void main(String[] args) {
        input();
        System.out.println(solution());
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        A = sc.nextInt();
        array = new int[K];
        for (int i = 0; i < K; i++) {
            array[i] = sc.nextInt();
        }
    }

    private static int solution() {
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] <= A) {
                count += A / array[i];
                A %= array[i];
            }
        }
        return count;
    }
}
