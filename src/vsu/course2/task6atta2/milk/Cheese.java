package vsu.course2.task6atta2.milk;

import vsu.course2.task6atta2.Info;

public class Cheese implements Info, MilkProduct {
    private String name;
    private int price;
    private double weight;
    private String country;
    boolean isLowFat;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getCountryOfOrigin() {
        return country;
    }

    @Override
    public void printProductInfo() {
        System.out.println("Название: " + getName() +
                ", Цена: " + getPrice() +
                ", Вес: " + getWeight() +
                ", Страна производства: " + getCountryOfOrigin() +
                ", Низкое содержание жира: " + isLowFat());
    }

    @Override
    public void buy() {
        System.out.println("Покупка сыра...");
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);
    }

    @Override
    public String isLowFat() {
        if (isLowFat == true) {
            return "Да";
        }
        else {
            return "Нет";
        }
    }
}
