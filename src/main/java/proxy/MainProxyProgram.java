package proxy;

/* Proxy Design Pattern: Proxy means in place of / representing / on behalf of. Controls and manage access to the object you'r presenting.
* Main advantage of proxy pattern is that it provides security.
* Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client.
* Type of Proxy: 1)Remote Proxy:Responsible for representing the object located remotely
* 2) Virtual Proxy: These proxies initiate the operation on real objects and provide a default result to the application. Once the real object is done, these proxies push the actual data to the client where it has provided dummy data earlier.
* 3) Protection Proxy: If an app does not have access to few things then it will become intermediator take result from them and give it back to you.
* Example: College internet which restricts few sites access. If that site is not part of restricted sites then it will connect you to the real internet. (Protection Proxies)
* 1) Create Internet interface with connectTo method which throws Exception.
* 2) Create RealInternet class which implements Internet interface. Implement connectTo() method and print connecting to sitename.
* 3) Create ProxyInternet class which implement Internet interface. Create and initialize private RealInternet object. Create arraylist which contains all the blocked sites (Write and initialize them in static block). Override connectTo() method.
*    Check if the site user trying to access is from the blocked sites. If it is then throw access denied exception. Else, given access to site by using realInternet object.
* 4) Inside main method create an object of ProxyInternet (As we will be accessing the real internet through proxy internet). Mention sites in try catch block.
 */

// This method acts as student/customer/client
public class MainProxyProgram {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");   //Access will be granted
            internet.connectTo("darkweb.com");  //Access will be denied
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
