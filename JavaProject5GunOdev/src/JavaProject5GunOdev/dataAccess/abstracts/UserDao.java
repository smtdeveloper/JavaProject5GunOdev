package JavaProject5GunOdev.dataAccess.abstracts;

import java.util.List;

import JavaProject5GunOdev.entities.concretes.User;

public interface UserDao {

	void register( User user );
	void login( User user );
	List<User> getall();
	
}
