import java.util.Scanner;

public class Task5 {
    public static int Fib(int n){
        if (n <= 1){
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int Fibnum = Fib(n);
        System.out.println(Fibnum);
    }
}