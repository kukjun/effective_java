package chapter2.item2.builder_pattern.pizza;

import static chapter2.item2.builder_pattern.pizza.NyPizza.Size.SMALL;
import static chapter2.item2.builder_pattern.pizza.Pizza.Topping.*;

public class PizzaHouse {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

    }
}
