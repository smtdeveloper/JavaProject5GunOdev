package JavaProject5GunOdev.business.abstracts;

import java.util.List;

import JavaProject5GunOdev.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(User user);
	
	List<User> getAll();
	
}
