package meATme;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
