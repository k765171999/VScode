import java.util.Scanner;

/**
 * scanner
 */
public class scanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        s.close();
        System.out.println(x);
    }
}