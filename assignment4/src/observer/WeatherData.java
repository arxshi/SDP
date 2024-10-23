package observer;

public class WeatherData {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        WeatherDisplay currentDisplay = new CurrentConditionsDisplay();
        WeatherDisplay statisticsDisplay = new StatisticsDisplay();
        WeatherDisplay forecastDisplay = new ForecastDisplay();

        station.addObserver(currentDisplay);
        station.addObserver(statisticsDisplay);
        station.addObserver(forecastDisplay);

        station.setWeatherData(25.5f, 65f, 1013f);
        System.out.println();
        station.setWeatherData(27.3f, 70f, 1005f);
        System.out.println();
        station.setWeatherData(23.9f, 80f, 1000f);
    }
}
