package edu.up.bsi.conv.gipcons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import edu.up.bsi.conv.gipcons.model.User;

@SpringBootApplication
public class GipConsApplication {

	private static final Logger log = LoggerFactory.getLogger(GipConsApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(GipConsApplication.class, args);
	}
	
	@Bean
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
	}
}
