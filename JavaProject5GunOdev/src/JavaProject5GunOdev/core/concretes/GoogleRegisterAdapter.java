package JavaProject5GunOdev.core.concretes;

import JavaProject5GunOdev.core.abstracts.RegisterService;
import JavaProject5GunOdev.google.GoogleRegisterManager;

public class GoogleRegisterAdapter implements RegisterService {

	GoogleRegisterManager google=new GoogleRegisterManager();
	
	@Override
	public void registerToSystem(String email, String password) {
		
		google.register(email, password);
	}

	@Override
	public void loginToSystem(String email, String password) {
		
		google.login(email, password);
		
	}

}
