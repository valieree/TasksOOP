package vsu.course2.task6atta2.bakery;


import vsu.course2.task6atta2.Product;
import vsu.course2.task6atta2.VeganProduct;

public class Bread extends Product implements VeganProduct {
 private boolean isGlutenFree;
 private boolean isWholeGrain;
 private double calories;
 private double protein;
 private double carbohydrates;
 private double fat;

 public Bread(String name, int price, double weight, String country, boolean isGlutenFree, boolean isWholeGrain, double calories, double protein, double carbohydrates, double fat) {
 super(name,price,weight,country);
  this.isGlutenFree = isGlutenFree;
  this.isWholeGrain = isWholeGrain;
  this.calories = calories;
  this.protein = protein;
  this.carbohydrates = carbohydrates;
  this.fat = fat;
 }

 @Override
 public double getCalories() {
  return calories;
 }

 @Override
 public double getProtein() {
  return protein;
 }


 @Override
 public double getCarbohydrates() {
  return carbohydrates;
 }
 @Override
 public double getFat() {
  return fat;
 }





 @Override
 public void printProductInfo() {
  System.out.println("Название: " + getName() +
          ", Цена: " + getPrice() +
          ", Вес: " + getWeight() +
          ", Страна производства: " + getCountryOfOrigin() +
          ", Без глютена: " + isGlutenFree +
          ", Цельнозерновой: " + isWholeGrain +
          ", Калории, БЖУ: " + calories + ", " + protein + ", " + carbohydrates);
 }

 @Override
 public void buy() {
  System.out.println("Покупка хлеба...");
  System.out.println("Вес: " + getWeight());
  System.out.println("Цена: " + getPrice());

 }
}
