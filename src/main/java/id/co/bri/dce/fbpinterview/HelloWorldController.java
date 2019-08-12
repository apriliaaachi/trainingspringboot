package id.co.bri.dce.fbpinterview;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  class Response {

    Response() {}

    public String message;

  }

  @GetMapping("/hello")
  Response print() {
    Response response = new Response();
    response.message = "Hello Dunia!";
    return response;
  }

}
