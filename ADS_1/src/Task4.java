import java.util.Scanner;

public class Task4 {
    public static int fac(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        return n * fac(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = scanner.nextInt();
        int facn= fac(n);
        System.out.println(facn);
        scanner.close();
    }
}