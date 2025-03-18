package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/price-chart")
    public String showPriceChart() {
        return "product/priceChart";
    }
}
