package com.example.demo4.gateway;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.Optional;

@Component
public class HttpBinGateway {

    private final RestClient restClient;

    public HttpBinGateway(RestClient restClient) {
        this.restClient = restClient;
    }


    public Optional<DataResponse> callWithDelay(int delay) {
        DataResponse result = restClient
                .get()
                .uri("https://httpbin.org/delay/5")
                .retrieve()
                .onStatus(HttpStatusCode::isError, (request, response) -> {
                    throw new RuntimeException("Error");
                }).body(DataResponse.class);
        return Optional.of(result);
    }

}
