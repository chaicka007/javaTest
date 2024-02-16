package day4;

import java.util.Random;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10001);
        }
        System.out.println(Arrays.toString(mass));
        int big = 0;
        int little = Integer.MAX_VALUE;
        int na0 = 0;
        int sumNa0 = 0;
        for(int mas:mass){
            if(mas>big)
                big = mas;
            if(mas<little)
                little = mas;
            if(mas%10==0) {
                na0++;
                sumNa0+=mas;
            }

        }
        System.out.printf("наибольший элемент массива: %d\n" +
                "наименьший элемент массива: %d\n" +
                "количество элементов массива, оканчивающихся на 0: %d\n" +
                "сумму элементов массива, оканчивающихся на 0: %d",
                big, little, na0, sumNa0);
    }
}
