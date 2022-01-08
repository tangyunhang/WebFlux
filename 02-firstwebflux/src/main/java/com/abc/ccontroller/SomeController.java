package com.abc.ccontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SomeController {
    @GetMapping("/common")
    public String commonHandle() {
        return "common handler";
    }

    // Mono：包含0个或1个元素的异步序列
    @RequestMapping("/mono")
    public Mono<String> momoHandle() {
        return Mono.just("Hello Mono");
    }
}
