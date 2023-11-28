package vsu.course2.task6atta2;

import vsu.course2.task6atta2.bakery.Bread;
import vsu.course2.task6atta2.drink.Juice;
import vsu.course2.task6atta2.meat.Sausage;
import vsu.course2.task6atta2.milk.Cheese;
import vsu.course2.task6atta2.sweet.Candy;

public class Main {
    public static void main(String[] args) {

        Sausage sausage = new Sausage("Sausage", 100, 100, "Russia", "Svin", true);
        sausage.printProductInfo();
        sausage.buy();
        Candy candy = new Candy("Candy", 250, 500, "France", false, 300);
        System.out.println(candy.getCaloriesPerPack());
        candy.buy();
        candy.printProductInfo();
        Juice juice = new Juice("Juice", 100, 1000, "Russia", false, false, "Apple");
        juice.printProductInfo();
        Bread bread = new Bread("Bread", 100, 250, "Russia", false, false, 100,100,100,100);
        bread.buy();

        Cheese cheese = new Cheese("Cheese", 100, 200, "Russia", true);
        cheese.buy();
        cheese.printProductInfo();
        System.out.println(cheese.isLowFat());
        System.out.println(cheese.getWeight());

    }
}
