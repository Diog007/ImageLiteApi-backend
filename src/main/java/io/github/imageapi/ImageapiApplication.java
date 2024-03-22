package io.github.imageapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImageapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageapiApplication.class, args);
	}

}
