import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        int n = in.nextInt();

        int a = n%10;
        count += a;

        int b = (n/10) % 10;
        count += b;

        int c = (n/100);
        count += c;

        System.out.println(count);

    }
}