package letscode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Git!";
        System.out.println(str);
        Scanner scanQ = new Scanner(System.in);
        int x = scanQ.nextInt();
        if (x == 2) {
            System.out.println(str + " again " + "2 + " + x + " = 4");
        } else if (x != 2) {
            System.out.println(str + " again " + "2 + ... something is wrong" );
        }

    }
}