package org.sid.frontadminprodspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FrontAdminProdSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontAdminProdSpringApplication.class, args);
    }
    @Controller
    public class ClientForwardController {
        @GetMapping(value = "/**/{path:[^\\.]*}")
        public String forward() {
            return "forward:/";
        }
    }

}
