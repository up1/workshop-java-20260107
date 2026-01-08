package com.example.demo4;

import com.example.demo4.gateway.DataResponse;
import com.example.demo4.gateway.HttpBinGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {

    private final HttpBinGateway gateway;

    public DemoController(HttpBinGateway gateway) {
        this.gateway = gateway;
    }

    @GetMapping("/data")
    public String getData() {
        Optional<DataResponse> result = this.gateway.callWithDelay(5);
        if(result.isEmpty()) {
            return "No data";
        }
        return result.get().url();
    }

}
