import java.util.Scanner;
public class Task3 {
    public static boolean Prime(int n, int d) {
        if (n <= 1) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return Prime(n, d + 1);
    }

    public static void prime2(int n) {
        if (Prime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scanner.nextInt();
        prime2(n);
        scanner.close();
    }
}