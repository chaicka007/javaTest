package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 12;
        int n = 8;
        int[][] massiv = new int[m][n];

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = rand.nextInt(51);
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0;
        int rowIndex = 0;
        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                sum += massiv[i][j];

            }
            if (maxSum <= sum) {
                maxSum = sum;
                rowIndex = i;
            }
            sum = 0;
        }
        System.out.printf("Сумма: %d\n" +
                            "Индекс строки: %d",
                            maxSum, rowIndex);
    }
}
