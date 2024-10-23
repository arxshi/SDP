package observer;

public class ForecastDisplay implements WeatherDisplay {
    private float lastPressure = 1000;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (pressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (pressure == lastPressure) {
            System.out.println("Forecast: More of the same.");
        } else {
            System.out.println("Forecast: Watch out for cooler, rainy weather.");
        }
        lastPressure = pressure;
    }
}
