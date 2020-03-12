package com.teedjay;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class WebHtmlScraper {

    public String fetch(String address) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(3))
            .build();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(address))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }


}
