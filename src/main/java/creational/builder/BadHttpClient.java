package creational.builder;

public class BadHttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String header;
    private String body;

    public BadHttpClient(String method, String url, String username, String password, String header, String body) {
        this.method = method;
        this.url = url;
        this.username = username;
        this.password = password;
        this.header = header;
        this.body = body;
    }

    @Override
    public String toString() {
        return "BadHttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
