package spring.restful.demo.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rioka on 13-Jun-17.
 */
@RestController
public class GreetingController {
    @RequestMapping("/hello")
    public String greeting(@RequestParam(name = "name") String name,
                            @RequestParam(name = "country", required = false,
                                    defaultValue = "Vietnam") String country){
        return "Hello "+name+" from " +country;
    }
}
