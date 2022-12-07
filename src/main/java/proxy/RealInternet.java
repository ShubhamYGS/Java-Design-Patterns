package proxy;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String siteName) throws Exception {
        System.out.println("Connecting to "+siteName);
    }
}
