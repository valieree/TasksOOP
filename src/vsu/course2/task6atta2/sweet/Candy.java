package vsu.course2.task6atta2.sweet;

import vsu.course2.task6atta2.Product;

public class Candy extends Product implements SweetProduct {

    private boolean isSugarFree;
    private double caloriesPer100Gramms;

    public Candy(String name, int price, double weight, String country, boolean isSugarFree, double caloriesPer100Gramms) {
        super(name,price,weight,country);
        this.isSugarFree = isSugarFree;
        this.caloriesPer100Gramms = caloriesPer100Gramms;
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
        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
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
        return caloriesPer100Gramms * getWeight()/100;
    }
}
