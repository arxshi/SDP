package decorator.topping;

import decorator.Pizza;

public class MushroomTopping extends ToppingDecorator {

    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.5;
    }
}
