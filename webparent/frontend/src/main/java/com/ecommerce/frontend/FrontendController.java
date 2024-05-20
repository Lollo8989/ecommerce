package com.ecommerce.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("")
    public String viewHome() {
        return "index";
    }
}
