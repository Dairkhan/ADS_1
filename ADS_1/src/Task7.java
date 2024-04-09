import java.util.Scanner;

public class Task7 {
    public static void perm(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                perm(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        perm(str, "");
        scanner.close();
    }
}