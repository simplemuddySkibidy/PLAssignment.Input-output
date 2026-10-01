import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        n = n % 1440;

        int h = n/60;
        int m = n%60;

       System.out.println(h + " " + m);
    }
}