package _0218_Object_relationships_stack_heap;

import java.util.*;

class MenuItem {
    private String name;
    private int price; // in cents

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class MealCard {
    private int studentID;
    private String studentName;
    private int storedValue = 0;

    public MealCard(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addValue(int value) {
        storedValue += value;
    }

    public boolean deduct(int value) {
        if (this.storedValue < value) {
            return false;
        }
        this.storedValue -= value;
        return true;
    }
}

public class MainClass {
    public static void main(String[] args) {
        MenuItem spaghetti = new MenuItem("Spaghetti", 500);
        MenuItem taco = new MenuItem("Taco", 600);
        MenuItem fries = new MenuItem("Fries", 200);

        MealCard esraCard = new MealCard("Esra", 1234);
        MealCard paulCard = new MealCard("Paul", 5678);

        esraCard.addValue(300);
        paulCard.addValue(700);

        List<MenuItem> esraItems = new ArrayList<>();
        purchase(esraCard, fries, esraItems);
        purchase(esraCard, taco, esraItems);
        purchase(paulCard, taco, esraItems);
    }

    public static void purchase(
        MealCard mealCard,
        MenuItem item,
        List<MenuItem> purchasedItems) {

        if (mealCard.deduct(item.getPrice())) {
            purchasedItems.add(item);
        }
    }
}