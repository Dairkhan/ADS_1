import java.util.Scanner;

public class Task1 {
    public static int minfind(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = minfind(arr, n - 1);
        if (min < arr[n - 1]) {
            return min;
        } else {
            return arr[n - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = minfind(array, n);
        System.out.println(min);

        scanner.close();
    }
}