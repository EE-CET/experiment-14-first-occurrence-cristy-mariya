import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                result = i + 1; // 1-based index
                break;
            }
        }

        System.out.println(result);
    }
}
