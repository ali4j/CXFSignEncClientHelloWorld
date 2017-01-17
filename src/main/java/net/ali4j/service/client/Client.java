package net.ali4j.service.client;

import net.ali4j.service.server.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ali4j on 1/5/2017.
 */
public class Client {

    public static void main(String[] args) {
            try(ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"client-beans.xml"})){
			HelloService service = (HelloService)context.getBean("helloClient");
			System.out.println(service.sayHello("ali4j"));
		}
    }
}
