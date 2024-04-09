import java.util.Scanner;

public class Task9 {
    public static int binom(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binom(n - 1, k - 1) + binom(n - 1, k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the k: ");
        int k = sc.nextInt();
        int res = binom(n, k);
        System.out.println(res);
        sc.close();
    }
}