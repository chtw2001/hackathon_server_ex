package likelion12th.test.controller;


import likelion12th.test.domain.Hello;
import likelion12th.test.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = { "*" })
public class HelloController {

    private final HelloService helloService;

    @PostMapping("/api/add")
    public Hello addHello(@RequestBody Map<String, String> requestBody) {
        return helloService.addHello(requestBody.get("name"));
    }

    @GetMapping("/api/get/{id}")
    public Hello getHello(@PathVariable Long id) {
        return helloService.getHello(id);
    }
}
