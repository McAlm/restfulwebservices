package de.mcalm.spring.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAO {

	private static int idCounter = 4;
	private static List<User> users = new ArrayList<>();

	private static List<Post> maxSeinePosts = Arrays.asList(new Post[] { new Post(new User(), "Hi!") });
	static {
		users.add(new User(1, "Max", LocalDate.of(1973, 11, 5)));
		users.add(new User(2, "Paul", LocalDate.of(1985, 1, 7)));
		users.add(new User(3, "Heidi", LocalDate.of(1994, 3, 15)));
		users.add(new User(4, "Susi", LocalDate.of(1986, 4, 28)));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++idCounter);
		}
		users.add(user);
		return user;
	}

	public User findOne(Integer id) {
		return users.stream().filter(u -> u.getId() == id).findFirst()
				.orElseThrow(() -> new UserNotFoundException(String.format("not found with Id %d", id)));

	}

	public void deleteUser(Integer id) {
		if (!UserDAO.users.removeIf(u -> u.getId().equals(id))) {
			throw new UserNotFoundException(String.format("not found with Id %d", id));
		}
	}
}
