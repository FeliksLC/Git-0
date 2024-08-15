package letscode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Git!";
        System.out.println(str);
        Scanner scanQ = new Scanner(System.in);
        int x = scanQ.nextInt();
        if (x>=3) {
            System.out.println("Объявлена дата выхода Half-Life-" + x);
        } else {
            System.out.println("123");
        }

    }
}