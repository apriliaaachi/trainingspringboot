package id.co.bri.dce.fbpinterview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringRunner.class)
@WebMvcTest
public class FbpInterviewApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getHelloApi() throws Exception {
      String uri = "/hello";
      MvcResult mvcResult = this.mockMvc.perform(get(uri)
          .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals("{\"message\":\"Hello Dunia!\"}", content);
  }

  @Test
  public void getSumApi() throws Exception {
      String uri = "/sum";
      MvcResult mvcResult = this.mockMvc.perform(
              post(uri)
              .content("[1, 2, 3]")
              .contentType(MediaType.APPLICATION_JSON)
              .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals("{\"sum\":6}", content);
  }

  @Test
  public void getMultiplicationApi() throws Exception {
      String uri = "/multiplication";
      MvcResult mvcResult = this.mockMvc.perform(post(uri)
              .content("[1,3,4]")
              .contentType(MediaType.APPLICATION_JSON)
              .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals("{\"multiplication\":12}", content);
  }

}
