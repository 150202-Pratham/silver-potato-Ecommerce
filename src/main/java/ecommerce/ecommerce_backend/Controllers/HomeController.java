package ecommerce.ecommerce_backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String ShowText(){

        return "Welcome To Something Called ROSIER"  ;



    }
}
