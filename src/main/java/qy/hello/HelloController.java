package qy.hello;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String sayHello(HttpServletRequest request) {
        // 获取客户端的IP地址
        String clientIp = request.getRemoteAddr();
        return "Hello, your IP address is: " + clientIp;
    }
    @GetMapping("/ip")
    public String sayIP(HttpServletRequest request) {
        // 获取客户端的IP地址
        String clientIp = request.getRemoteAddr();
        return clientIp;
    }
}