package potluck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=PotluckMainController.class)
public class PotluckApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotluckApplication.class, args);
	}
}