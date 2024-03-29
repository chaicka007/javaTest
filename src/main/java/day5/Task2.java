package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2018, "red", "Yamaha YZF-R1M");
        System.out.printf("Год выпуска: %d\n" +
                "Цвет: %s\n" +
                "Модель: %s\n",bike.getYear(),bike.getColor(),bike.getModel());
    }
}

class Motorbike {
    private int year;
    private String color, model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }
}