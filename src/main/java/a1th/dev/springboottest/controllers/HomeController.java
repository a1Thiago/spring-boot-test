package a1th.dev.springboottest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping(path = { "/api", "/" })
  public Map<String, String> ready() {
    Map<String, String> response = new HashMap<>();
    response.put("ready", "✔");
    return response;
  }

}
