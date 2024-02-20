package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player(90);
        Player.info();
        Player p2 = new Player(60);
        Player p3 = new Player(50);
        Player.info();
        Player p4 = new Player(5);
        Player p5 = new Player(5);
        Player.info();
        Player p6 = new Player(1);
        Player.info();
        Player p7 = new Player(5);
        Player p8 = new Player(1);
        System.out.println(Player.getCountPlayers());
        p8.run();
        p6.run();
        Player.info();
    }
}
