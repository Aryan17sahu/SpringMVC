package com.skytech.webservices;

import com.skytech.response.ProductJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Component
public class ProductRestService {

    @Autowired
    RestTemplate restTemplate;

    public ProductJson getResponseProduct() {

        ResponseEntity<ProductJson> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/1", ProductJson.class);
        System.out.println(forEntity);

        return forEntity.getBody();
    }

    public List<ProductJson> getResponseProductList() {

        ResponseEntity<ProductJson[]> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/", ProductJson[].class);
        System.out.println(forEntity);

        return List.of(Objects.requireNonNull(forEntity.getBody()));
    }
}
