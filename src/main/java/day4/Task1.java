package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int n = s.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < n; i++)
            mass[i] = rand.nextInt(11);
        System.out.println("Введено число " + n + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(mass));

        System.out.println("\nИнформация о массиве:");
        System.out.println("Длина массива: " + mass.length);
        int morethan8 = 0;
        int equal1 = 0;
        int evenNum = 0;
        int oddNum = 0;
        int summ = 0;
        for (int mas : mass) {
            if (mas > 8)
                morethan8++;
            if (mas == 1)
                equal1++;
            if (mas%2==0)
                evenNum++;
            else oddNum++;
            summ+=mas;
        }
        System.out.println("Количество чисел больше 8: " + morethan8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + evenNum);
        System.out.println("Количество нечетных чисел: " + oddNum);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}

/* //Более нормальный вид кода
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое положительное число, отличное от нуля, для генерации массива.");
        int sizeArray = s.nextInt();

        int[] array = generateArray(sizeArray); // тут заполнили массив

        System.out.printf("Введено число %d. Сгенерирован следующий массив:", sizeArray);
        System.out.println(Arrays.toString(array));

        printArrayInformation(array); //сообщили инфу о массиве
    }

    private static int[] generateArray(int sizeArray) {
        Random rand = new Random();

        int[] mass = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {         // фигурные скобки лучше все таки ставить у циклов
            mass[i] = rand.nextInt(11);
        }

        return mass;
    }

    private static void printArrayInformation(int[] array) {

        int morethan8 = 0;
        int equal1 = 0;
        int evenNum = 0;
        int oddNum;
        int summ = 0;

        for (int number : array) { //изменил наименование переменной иетрирования
            if (number > 8) morethan8++;
            if (number == 1) equal1++;
            if (number % 2 == 0) evenNum++;

            summ += number;
        }

        // что бы убрать блок else и улучшить читаемость, просто вычтем от размера четные
        // хотя твой подход тоже отлично, это просто вкусовщина, я бы так писал, так как когда веток else будет 10+
        // хер уследишь где что
        oddNum = array.length - evenNum;


        // я бы через формат бы сделал что бы каждый раз строку не создавать и не засирать heap
        System.out.printf(
                "\nИнформация о массиве:\n " +
                        "Длина массива: %d \n " +
                        "Количество чисел больше 8: %d \n " +
                        "Количество чисел равных 1: %d \n " +
                        "Количество четных чисел: %d \n " +
                        "Количество нечетных чисел: %d \n " +
                        "Сумма всех элементов массива: %d",
                array.length, morethan8, equal1, evenNum, oddNum, summ);

    }


}*/
