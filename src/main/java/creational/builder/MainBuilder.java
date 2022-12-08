package creational.builder;

/* Builder Design Pattern: It says that "construct a complex object from simple objects using step-by-step approach".  It is used to construct a complex object step by step and the final step will return the object.
* We can create this pattern when we don't want to utilize each and every parameter of that class. Eg., In HttpClient clas suppose if user don't want to pass body and header when requesting data using GET method.
* Advantage: Builder design pattern also helps in minimizing the number of parameters in the constructor and thus there is no need to pass in null for optional parameters to the constructor.
* Disadvantage: The number of lines of code increases at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
* in BadHttpClient class we have shown a disadvantage of not using builder class. Here, we have to initialize each and everything like header, body even though we are not using them.
* Steps to create Builder Design Pattern:
* 1. Create GoodHttpClient class with all the private variable like method, url, username, password, header and body.
* 2. Insider class create a static class with HttpClientBuilder name. This class contains all the private variable along with all the methods who initialize those variable with return type same as class.
* 3. Inside static class create one more method build() which return the parent class object which initializes inner static builder class.
* 4. Create a constructor outside which initializes inner static HttpClientBuilder class.
* 5. Write all the getter which gives access to get any set parameter.
* 6. Create a toString() method which can print all the variables.
* 7. In main class call static HttpClientBuilder with GoodHttpClient class. new GoodHttpClient.httpClientBuilder().build();
 */

public class MainBuilder {
    public static void main(String[] args) {
        // Without Builder
        BadHttpClient badHttpClient = new BadHttpClient("GET","www.test.com","shubham","pass123",null,null);
        System.out.println(badHttpClient);

        // With Builder
        GoodHttpClient goodHttpClient = new GoodHttpClient.HttpClientBuilder().method("GET").url("www.test.com").secure("shubham","pass123").build();
        System.out.println(goodHttpClient);
    }
}
