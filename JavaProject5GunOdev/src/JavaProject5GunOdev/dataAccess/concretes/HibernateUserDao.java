package JavaProject5GunOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import JavaProject5GunOdev.dataAccess.abstracts.UserDao;
import JavaProject5GunOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users= new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(" - Kay�t ba�ar�l� : " + user.getName());
		users.add(user);
	}

	@Override
	public void login(User user) {
		
		System.out.println(" - Giris ba�ar�l� : " + user.getName());
		
	}

	@Override
	public List<User> getall() {
		
		return users;
	}

}
