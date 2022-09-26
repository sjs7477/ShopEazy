package com.sjs7477.shopeazy;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldControllerTest {
@LocalServerPort
    private int port;
//@Autowired
//    private TestRestTemplate testRestTemplate;
//@Test
//    public void HelloWorldCheck(){
//    assertEquals("Hello World from Spring Boot!!!",testRestTemplate.getForObject("http://localhost:"+port+"/",
//            String.class));
//}
}
