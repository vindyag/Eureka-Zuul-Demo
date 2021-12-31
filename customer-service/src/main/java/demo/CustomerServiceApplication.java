package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CustomerServiceApplication implements GreetingController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;
    @Value("${server.port}")
    private String portNumber;

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public String greeting() {
        System.out.println(portNumber + ">>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<");
        return "hii";
    }
}
