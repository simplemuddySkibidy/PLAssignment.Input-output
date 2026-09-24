import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The next number for the number " + n + " is " + (n + 1) + ".");
        System.out.println("The previous number for the number " + n + " is " + (n - 1) + ".");
    }
}
