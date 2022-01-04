package demo;

import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${server.port}")
    private String portNumber;

    //@Value("${spring.application.name}")
   // private String appName;

    @RequestMapping("/greeting")
    String greeting(){
        System.out.println(portNumber + ">>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
        return portNumber;
        //return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());

    }
}
