package vsu.course2.task3;

public class Animal {
    private String habitat; //место обитания
    private String color;



    public Animal(String habitat, String color) {
        this.habitat = habitat;
        this.color = color;


    }

    public String getColor() {
        return color;
    }


    public void whereLives() {
        System.out.println("Место обитания: " + habitat);
    }
    public void whatColor() {
        System.out.println("Цвет: " + color);
    }
    public void prettyPrint() {
        System.out.println("Животное!");
    }


}
