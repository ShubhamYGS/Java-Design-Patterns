package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("hacking.com");
        bannedSites.add("fakeid.com");
        bannedSites.add("darkweb.com");
    }

    @Override
    public void connectTo(String siteName) throws Exception {
        if(bannedSites.contains(siteName)) {
            throw new Exception("Access Denied: "+siteName);
        }
        realInternet.connectTo(siteName);
    }
}
