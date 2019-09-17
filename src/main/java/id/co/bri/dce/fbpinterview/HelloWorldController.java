package id.co.bri.dce.fbpinterview;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  class Response {
      public String message;

      Response() {}
  }

  class ResponseSum {
      public int sum;

      ResponseSum() {}
  }

  @GetMapping("/hello")
  Response print() {
      Response response = new Response();
      response.message = "Hello Dunia!";
      return response;
  }

  @PostMapping("/sum")
  ResponseSum sum(@RequestBody Integer[] data) {
    ResponseSum res = new ResponseSum();
    for (Integer value : data) {
      res.sum += value.intValue();
    }
    return res;
  }

}
