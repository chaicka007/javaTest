package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane a1 = new Airplane("fake",2001,38,106);
    Airplane a2 = new Airplane("fuke",2002,768,90);
    Airplane.compareAirplanes(a1,a2);
    }
}