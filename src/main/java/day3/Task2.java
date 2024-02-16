package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b;
        while (true){
            a = s.nextDouble();
            b = s.nextDouble();
            if (b==0)
                break;
            System.out.print(a/b+"\n");
        }
    }
}