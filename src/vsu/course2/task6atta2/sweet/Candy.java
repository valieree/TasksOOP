package vsu.course2.task6atta2.sweet;

import vsu.course2.task6atta2.Info;

public class Candy implements Info, SweetProduct {
    private String name;
    private int price;
    private double weight;
    private String country;
    private boolean isSugarFree;
    private double caloriesPer100Gramms;

    public Candy(String name, int price, double weight, String country, boolean isSugarFree, double caloriesPer100Gramms) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
        this.isSugarFree = isSugarFree;
        this.caloriesPer100Gramms = caloriesPer100Gramms;
    }

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
                ", Без сахара: " + isSugarFree() +
                ", Количество калорий на упаковку: " + getCaloriesPerPack());
    }

    @Override
    public void buy() {
        System.out.println("Покупка конфет...");
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);
    }

    @Override
    public String isSugarFree() {
        if (isSugarFree == true) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    @Override
    public double getCaloriesPerPack() {
        return caloriesPer100Gramms * weight/100;
    }
}
