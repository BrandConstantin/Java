import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import sun.net.www.http.HttpClient;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    private static final String DATA_URL =
            "http://services.hanselandpetal.com/feeds/flowers.json";

    public static void main(String[] args)
            throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(new URI(DATA_URL))
                        .GET()
                        .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandler.asString());
        System.out.println(response.body());
    }
}
