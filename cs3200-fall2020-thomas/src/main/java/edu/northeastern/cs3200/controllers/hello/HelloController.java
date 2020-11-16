package edu.northeastern.cs3200.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @RequestMapping("/api/hello/string")
  public String sayHello() {
    return "Hello Alfston Thomas!";
  }
  @RequestMapping("/api/hello/object")
  public HelloObject sayHelloObject() {
    HelloObject obj = new HelloObject("Hello Alfston Thomas!");
    return obj;
  }
}


