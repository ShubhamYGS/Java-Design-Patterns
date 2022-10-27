package adapater;

/*
* Adapter: An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
* Here, in our example we want the temperature of city. Interface needs city to find temperature where as our main method provides zipcode to find temperature.
* So, we need to have adapter which finds city based on zipcode and return the temperature to main method.
* 1. Create interface WeahtherFinder with find method that accepts city as parameter.
* 2. Create WeatherFinderImpl class which implements WeatherFinder interface and it's find method.
* 3. As Main method is trying to find temperature with zipcode and we have interface with city. So we can't directly access interface.
* 4. So, in order to have interconnection between these two things we will create WeatherAdapter class. Which find city based on zipcode and return the temperature.
* 5. In main method create object of adpater class and call findTemperature method which accepts zipcode as a parameter and returns the temperature.
 */

public class MainMethodAdapterWeahtherUI {
    public static void main(String[] args) {
        int zipCode = 416314;
        WeatherAdapter adapter = new WeatherAdapter();
        int temperature = adapter.findTemperature(zipCode);
        System.out.println("Temperature of "+zipCode+" is: "+temperature);
    }
}
