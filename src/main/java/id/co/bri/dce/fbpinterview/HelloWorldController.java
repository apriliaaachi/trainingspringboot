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

  class ResponseMultiplication{
        public int multiplication;

        ResponseMultiplication(){}
  }

  @PostMapping("/multiplication")
  ResponseMultiplication multiplication(@RequestBody Integer[] data) {
        ResponseMultiplication response = new ResponseMultiplication();
        response.multiplication = 1;
        for (Integer value:data) {
            response.multiplication *= value.intValue();
        }

        return response;
  }

}
