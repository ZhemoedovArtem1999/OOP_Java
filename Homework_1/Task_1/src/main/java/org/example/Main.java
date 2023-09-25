package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new HotDrink("Чай", 15, 250, 55));
        products.add(new HotDrink("Капучино", 55, 300, 75));
        products.add(new HotDrink("Американо", 35, 270, 50));
        products.add(new HotDrink("Кипяток", 5, 240, 90));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(products);
        try {
            System.out.println(hotDrinkVendingMachine.getProduct("Капучино"));
            System.out.println(hotDrinkVendingMachine.getProduct("Кипяток", 240));
            System.out.println(hotDrinkVendingMachine.getProduct("Американо", 270, 50));
        }
        catch (IllegalStateException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}