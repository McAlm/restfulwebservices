package de.mcalm.spring.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class User {

	@Size(min=3, message="name must be at least 3 characters")
	private String name;
	private Integer id;
	private java.time.LocalDate birthday;

	private List<Post> posts;

	public User() {
		super();
	}

	public User(int id, String name, LocalDate birthday) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
		this.posts = new ArrayList<Post>();
	}

	public User(int id, String name, LocalDate birthday, List<Post> posts) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
		this.posts = posts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public java.time.LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(java.time.LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", birthday=" + birthday + "]";
	}

}
