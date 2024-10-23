package observer;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.printf("Current conditions: %.1f C degrees, %.1f%s humidity, %.1f pressure hPa.%n", temperature, humidity, "%", pressure);
    }
}
