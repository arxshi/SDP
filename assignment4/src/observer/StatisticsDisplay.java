package observer;

public class StatisticsDisplay implements WeatherDisplay {
    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0;
    private int numReadings = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        double avg = (tempSum / numReadings);
        double max = maxTemp;
        double min = minTemp;
        System.out.printf("Avg/Max/Min temperature: %.1f/%.1f/%.1f%n", avg, max, min);
    }
}