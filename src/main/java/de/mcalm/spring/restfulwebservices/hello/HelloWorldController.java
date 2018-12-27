package de.mcalm.spring.restfulwebservices.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;

@RestController
public class HelloWorldController {

	@Autowired
	ResourceBundleMessageSource messageSource;

	@Autowired
	LocaleResolver localeResolver;

	@GetMapping("/hello")
	public String getHello() {
		return "Hello, World!";
	}

	@GetMapping("/hello-world-bean")
	public HelloBean getHelloBean() {
		return new HelloBean("Hello, world from a bean!");
	}

	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloBean getHelloBean(@PathVariable String name) {
		return new HelloBean(
				messageSource.getMessage("hello.world", new Object[] { name }, LocaleContextHolder.getLocale()));
	}
}
