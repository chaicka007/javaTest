package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setYear(2001);
        lada.setColor("Yellow");
        lada.setModel("Granta");

        System.out.println("Год: " + lada.getYear() + " Цвет: " + lada.getColor() + " Модель: " + lada.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}