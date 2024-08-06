package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World Thanh 123 ";
    }

    @GetMapping("/user")
    public String userpage() {
        return "Only user can access this page";
    }

    @GetMapping("/admin")
    public String adminpage() {
        return "Only admin can access this page ";
    }
}
