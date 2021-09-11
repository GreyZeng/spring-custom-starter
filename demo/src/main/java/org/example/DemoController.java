package org.example;

import git.snippet.HelloService;
import git.snippet.MyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    public HelloService helloService;

    @MyLog(desc = "hello world")
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }

    @MyLog(desc = "基本信息")
    @GetMapping("/info")
    public String info() {
        return helloService.helloWorld();
    }

}
