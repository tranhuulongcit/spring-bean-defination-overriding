package info.cafeit.springbeandefinationoverriding;

import info.cafeit.springbeandefinationoverriding.bean.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanDefinationOverridingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBeanDefinationOverridingApplication.class, args);
        Actor actresses = (Actor) context.getBean("actresses");

        System.out.println(actresses.getName());
    }

}
