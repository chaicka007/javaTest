package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public int getFuel(){
        return fuel;
    }

    public void fillUp(int fuelup){
        fuel += fuelup;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.printf("Изготовитель: %s" +
                ", год выпуска: %d" +
                ", длина: %d" +
                ", вес: %d" +
                ", количество топлива в баке: %d", producer, year, length, weight, fuel);
    }
    public static void compareAirplanes(Airplane a1, Airplane a2){
        if (a1.getLength()>a2.getLength()){
            System.out.println("Первый самолет длиннее");
        } else if(a1.getLength()<a2.getLength()){
            System.out.println("Второй самолет длиннее");
        } else{
            System.out.println("Длина равна");
        }
    }
}

