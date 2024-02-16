package day6;

public class Motorbike {
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

    public void info() {
        System.out.println("Это матоцоикл");
    }
    public int yearDifference(int year){
        return this.year - year;
    }
}