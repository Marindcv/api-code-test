package com.apicodetest.client;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

    FizzbuzzClient client = new FizzbuzzClient();

    public FizzBuzzService() {
        client.builder()
                .requestFactory(new HttpComponentsClientHttpRequestFactory())
                .messageConverters(converters -> converters.add(new MyCustomMessageConverter()))
                .baseUrl("https://example.com")
                .defaultUriVariables(Map.of("variable", "foo"))
                .defaultHeader("My-Header", "Foo")
                .requestInterceptor(myCustomInterceptor)
                .requestInitializer(myCustomInitializer)
                .build();
    }

    public void getFizzBuzz() {
        client.get()
                .uri("https://example.com/orders/{id}", id)
    }
}
