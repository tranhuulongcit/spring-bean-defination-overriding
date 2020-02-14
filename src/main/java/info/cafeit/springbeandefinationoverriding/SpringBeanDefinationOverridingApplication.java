package info.cafeit.springbeandefinationoverriding;

import info.cafeit.springbeandefinationoverriding.bean.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanDefinationOverridingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBeanDefinationOverridingApplication.class, args);
        //Actor actresses = (Actor) context.getBean("actresses");
       // System.out.println("Diễn viên chính: " + actresses.getName());
    }

    @Autowired
    private Actor actresses;

    @Override
    public void run(String... args) throws Exception {
         System.out.println("Diễn viên chính: " + actresses.getName());
    }
}
