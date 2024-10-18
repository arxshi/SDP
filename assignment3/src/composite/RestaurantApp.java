package composite;

public class RestaurantApp {
    public static void main(String[] args) {

        MenuComponent pancakeItem = new MenuItem("Pancake", "Delicious pancake with syrup", 5.99);
        MenuComponent burgerItem = new MenuItem("Burger", "Juicy beef burger with fries", 8.99);
        MenuComponent coffeeItem = new MenuItem("Coffee", "Hot brewed coffee", 2.99);

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning meals");
        breakfastMenu.add(pancakeItem);
        breakfastMenu.add(coffeeItem);

        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");
        lunchMenu.add(burgerItem);

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);

        allMenus.print();
    }
}
