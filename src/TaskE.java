import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int t = in.nextInt();

        int ans = (v * t) % 109;
        if (ans < 0) {
            ans += 109;
        }
        System.out.println(ans);

    }
}