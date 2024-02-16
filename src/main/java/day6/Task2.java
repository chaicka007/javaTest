package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeng = new Airplane("Russia", 2002, 78, 780);
        boeng.setYear(2005);
        boeng.setLength(76);
        boeng.fillUp(90);
        boeng.fillUp(100);
        boeng.info();
    }
}
