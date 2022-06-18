package socialify.appgateway;

import controller.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = AuthController.class)
public class SocialifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialifyApplication.class, args);
	}

}
