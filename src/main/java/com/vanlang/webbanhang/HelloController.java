package com.vanlang.webbanhang;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class HelloController {
    @GetMapping ("/")
    public String home( Model model) {
        return "/layout";
}
}