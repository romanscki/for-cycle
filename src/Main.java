import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        for (int a = 0; a <= value; a = a + 1) {
            for (int b = 1; b <= value; b = b + 1) {
                if (a * b == value) {
                    System.out.println(a + "*" + b + "!!!");
                }
            }
        }
    }
}
