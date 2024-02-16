package day4;

import java.util.Random;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();


        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = rand.nextInt(10001);
        }


        int sumMax = 0;
        int index = 0;

        for (int i = 0; i <= massiv.length - 3; i++) {

                if (massiv[i] + massiv[i + 1] + massiv[i + 2] > sumMax) {
                    sumMax = massiv[i] + massiv[i + 1] + massiv[i + 2];
                    index = i;

            }
        }

        System.out.println(Arrays.toString(massiv)); //вывод самого массива
        System.out.printf("%d\n" + "%d", sumMax, index); //вывод суммы тройки и индекса

    }
}
