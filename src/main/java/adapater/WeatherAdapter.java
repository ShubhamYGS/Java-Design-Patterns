package adapater;

public class WeatherAdapter {

    public int findTemperature(int zipCode) {
        String city = null;

        if(zipCode == 416310) {
            city = "Sangli, Maharashtra";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);

        return temperature;
    }
}
