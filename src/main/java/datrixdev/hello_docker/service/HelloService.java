package datrixdev.hello_docker.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
        public String getHello() {
            return "Hello from Service";
        }
}
