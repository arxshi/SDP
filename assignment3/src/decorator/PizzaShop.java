package decorator;

import decorator.topping.CheeseTopping;
import decorator.topping.MushroomTopping;
import decorator.topping.PepperoniTopping;

public class PizzaShop {
    public static void main(String[] args) {

        Pizza margheritaPizza = new MargheritaPizza();
        margheritaPizza = new CheeseTopping(margheritaPizza);
        margheritaPizza = new MushroomTopping(margheritaPizza);

        System.out.println(margheritaPizza.getDescription() + " | Total cost: $" + margheritaPizza.getCost());

        Pizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza = new PepperoniTopping(vegetarianPizza);
        vegetarianPizza = new CheeseTopping(vegetarianPizza);

        System.out.println(vegetarianPizza.getDescription() + " | Total cost: $" + vegetarianPizza.getCost());

    }
}
