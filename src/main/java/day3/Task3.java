package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            double dividend = s.nextDouble();
            double divisor = s.nextDouble();
            if (divisor == 0) {
                System.out.print("Деление на 0\n");
                continue;
            }
            System.out.print(dividend / divisor + "\n");
        }
    }
}
