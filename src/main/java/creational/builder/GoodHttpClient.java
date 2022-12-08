package creational.builder;

public class GoodHttpClient {

    private String method;
    private String url;
    private String username;
    private String password;
    private String header;
    private String body;

    public GoodHttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
        this.header = httpClientBuilder.header;
        this.body = httpClientBuilder.body;

    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String username;
        private String password;
        private String header;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder secure(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public HttpClientBuilder header(String header) {
            this.header = header;
            return this;
        }

        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }
        
        public GoodHttpClient build() {
            return new GoodHttpClient(this);
        }
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "GoodHttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
