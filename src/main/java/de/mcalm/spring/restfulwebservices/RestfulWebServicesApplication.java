package de.mcalm.spring.restfulwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver slr = new AcceptHeaderLocaleResolver();
		slr.setDefaultLocale(Locale.FRENCH);
		return slr;
	}

	// not needed anymore ==> spring.messages.basename in application.properties
	// @Bean
	// public ResourceBundleMessageSource messageSource() {
	// ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
	// rbms.setBasename("messages");
	// return rbms;
	// }

}
