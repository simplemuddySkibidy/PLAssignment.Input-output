import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int h = n/3600%24;
        int m = n%3600/60;
        int s = n%60;

        System.out.printf("%d:%02d:%02d", h, m, s);
    }
}