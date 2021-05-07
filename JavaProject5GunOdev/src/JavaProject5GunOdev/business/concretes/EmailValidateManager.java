package JavaProject5GunOdev.business.concretes;

import JavaProject5GunOdev.business.abstracts.UserValidateService;
import JavaProject5GunOdev.entities.concretes.User;

public class EmailValidateManager implements UserValidateService {

	@Override
	public void validate(User user) {
		System.out.println(user.getEmail()+" - Adresinize do�rulama maili g�nderildi.");
		System.out.println("Kaydiniz basarili sekilde olusturuldu.");
	}

}
