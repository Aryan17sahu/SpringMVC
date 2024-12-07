package com.skytech.controller;

import com.skytech.response.ProductJson;
import com.skytech.webservices.ProductRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductRestService productRestService;


    @RequestMapping("/product")

    public String getResponse(Model model) {
        ProductJson responseProduct = productRestService.getResponseProduct();
        System.out.println(responseProduct);
        model.addAttribute("product", responseProduct);

        return "product";

    }

    @RequestMapping("/productList")

    public String getResponseList(Model model) {
        List<ProductJson> responseProductList = productRestService.getResponseProductList();
        System.out.println(responseProductList);
        System.out.println(responseProductList.get(6));
        model.addAttribute("product", responseProductList);

        return "product";

    }
}
