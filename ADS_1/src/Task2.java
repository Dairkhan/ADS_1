import java.util.Scanner;
public class Task2 {
    public static float aver(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            float sum = arr[n - 1] + aver(arr, n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        float average = aver(array, n) / n;
        System.out.println(average);

        scanner.close();
    }
}