package JavaProject5GunOdev.core.concretes;

import JavaProject5GunOdev.core.abstracts.RegisterService;
import JavaProject5GunOdev.github.GithubRegisterManager;

public class GithubRegisterAdapter implements RegisterService {

	GithubRegisterManager github = new GithubRegisterManager();
	
	@Override
	public void registerToSystem(String email, String password) {
	
		github.register(email, password);
	}

	@Override
	public void loginToSystem(String email, String password) {
		
		github.login(email, password);
		
	}

	
}
