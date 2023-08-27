package hello.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        //.run(@SpringBootApplication 있는 현재 클래스, args)
        SpringApplication.run(BootApplication.class, args);
    }

}
