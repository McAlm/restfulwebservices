package de.mcalm.spring.restfulwebservices.user;

import java.time.LocalDateTime;

public class Post {
	private User user;
	private LocalDateTime created;
	private String message;

	public Post(User user, String message) {
		super();
		this.user = user;
		this.created = LocalDateTime.now();
		this.message = message;
	}

	public Post(User user, LocalDateTime created, String message) {
		super();
		this.user = user;
		this.created = created;
		this.message = message;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public String getMessage() {
		return message;
	}

	public User getUser() {
		return user;
	}

}
