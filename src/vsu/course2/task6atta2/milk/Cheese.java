package vsu.course2.task6atta2.milk;
import vsu.course2.task6atta2.Product;

public class Cheese extends Product implements MilkProduct {

    private boolean isLowFat;

    public Cheese(String name, int price, double weight, String country, boolean isLowFat) {
        super(name,price,weight,country);
        this.isLowFat = isLowFat;
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
        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
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
