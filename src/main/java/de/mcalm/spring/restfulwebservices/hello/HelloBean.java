package de.mcalm.spring.restfulwebservices.hello;

public class HelloBean {

	private String greet;

	public HelloBean(String greet) {
		super();
		this.greet = greet;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	@Override
	public String toString() {
		return String.format("HelloBean [greet=%s]", this.greet);
	}

}
