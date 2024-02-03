package day0;
import java.util.Scanner;
public class test {
    public static void main(String [] args){
        int value = -3;
        while(value!=1){
            System.out.println(value);
            ++value;
        }
        for(byte i = 0; i <=5; i+=2){
            System.out.println("test2, i= " + i);
        }
        int x = 5;
        float y  = 6;

        System.out.printf("x=%d; y=%.3243f", x, y);

        Scanner in  = new Scanner(System.in);
        System.out.println("\ngive me a number: ");
        int number = in.nextInt();
        System.out.println("number is "+ number);
    }
}
