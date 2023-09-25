package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements  VendingMachine{
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = new ArrayList<>(products);
    }
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public Product getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s и объемом %s не найден.", name, volume));
    }

    public Product getProduct(String name, int volume, int temperature){
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name)
                        && ((HotDrink) product).getVolume() == volume
                        && ((HotDrink) product).getTemperature() == temperature ){
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s и объемом %s, и температурой %s не найден.", name, volume, temperature));
    }
}
