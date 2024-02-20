package day7;

import java.text.MessageFormat;
import java.util.Random;

public class Player {
    private int stamina;
    private boolean onField; //на футбольном ли поле?
    private static int countPlayers;
    private static int inReserveCount;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public Player(int stamina) { //создание игрока
        this.stamina = stamina;
        // Random rand = new Random();
        //this.stamina = rand.nextInt(MAX_STAMINA - 90 + 1) + 90;
        if (countPlayers <6){
            this.onField = true;
            countPlayers++;
        } else{
            inReserveCount++;
            this.onField = false;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {

        if (this.onField) {
            this.stamina -= 1;
            if (this.stamina == MIN_STAMINA) {
                this.onField = false;
                System.out.println("Чел выдохся и уходит с поля");
                inReserveCount++;
                countPlayers--;
            }
        } else {
            System.out.println("Чел не на поле");
        }

    }
    public static void info(){
        if (countPlayers <6){
            System.out.printf("Команды неполные. На поле еще есть %d" + declension(), 6- countPlayers);
        } else {
            System.out.print("На поле нет свободных мест\n");
        }
    }
    private static String declension(){
        switch (6-countPlayers) {
            case 1:
                return " свободное место\n";
            case 2:
            case 3:
            case 4:
                return " свободных места\n";
            default:
                return " свободных мест\n";

        }
        }
    }

