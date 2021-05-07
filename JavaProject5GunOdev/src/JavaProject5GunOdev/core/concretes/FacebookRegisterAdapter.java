package JavaProject5GunOdev.core.concretes;

import JavaProject5GunOdev.core.abstracts.RegisterService;
import JavaProject5GunOdev.facebook.FacebookRegisterManager;

public class FacebookRegisterAdapter implements RegisterService {

	FacebookRegisterManager facebook = new FacebookRegisterManager();
	
	@Override
	public void registerToSystem(String email, String password) {
		
	facebook.register(email, password);
		
	}

	@Override
	public void loginToSystem(String email, String password) {
		
	facebook.login(email, password);
		
	}

}
