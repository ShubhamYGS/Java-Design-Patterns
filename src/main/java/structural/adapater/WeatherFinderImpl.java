package structural.adapater;

import java.util.Random;

public class WeatherFinderImpl implements WeatherFinder{

    @Override
    public int find(String city) {
        Random random = new Random();
        return random.nextInt(50);
    }
}
