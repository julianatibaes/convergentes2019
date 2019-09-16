package edu.up.bsi.conv.gip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
public class GipClientApplication {

//	private static final Logger log = LoggerFactory.getLogger(GipClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GipClientApplication.class, args);
	}
	
	
/*	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			User user = restTemplate.getForObject(
					"http://localhost:9090/user/1", User.class);
			log.info(user.toString());
		};
	} */

}
