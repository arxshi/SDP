package decorator;

public class VegetarianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegeterian Pizza";
    }

    @Override
    public double getCost() {
        return 13.99;
    }
}
