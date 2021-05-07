package JavaProject5GunOdev;

import JavaProject5GunOdev.business.concretes.EmailValidateManager;
import JavaProject5GunOdev.business.concretes.UserManager;
import JavaProject5GunOdev.core.abstracts.RegisterService;
import JavaProject5GunOdev.core.concretes.FacebookRegisterAdapter;
import JavaProject5GunOdev.core.concretes.GithubRegisterAdapter;
import JavaProject5GunOdev.core.concretes.GoogleRegisterAdapter;
import JavaProject5GunOdev.dataAccess.concretes.HibernateUserDao;
import JavaProject5GunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		User user1 = new User(1,"Samet","Akca" ,"sametakca@gmail.com","123456");
		User user2 = new User(2,"Mücahit","SonKaya" ,"MÜCO@gmail.com","123");
		User user3 = new User(3,"Burak","DemirKıran" ,"BURKİ@gmail.com","123456");
		
		UserManager userManager=new UserManager(new HibernateUserDao(),new EmailValidateManager());
		
		System.out.println("\n ----- Kayit  Mesaji ----- ");
		userManager.register(user1);
		System.out.println("\n ----- Aynı kişi aynı mail ile kayıt yapınca   Mesaji ----- ");
		userManager.register(user1);
		
		System.out.println("\n ----- Yetersiz karekter  sifre  Kayit  Mesaji ----- ");
		userManager.register(user2);
	
		User[] users = { user1, user2, user3 };
		
		System.out.println("\n---------- Kullanicilar ---------");
		for (var user : users ) {
			
			System.out.println(user.getName());
		}
		
		
		System.out.println("\n ------- Login -------");
		userManager.login(user1);
		
		
		
		System.out.println("\n***** Google  ile Giris ******");
		RegisterService GoogleregisterService=new GoogleRegisterAdapter();
		
		GoogleregisterService.registerToSystem("sametakca@gmail.com", "123456");
		GoogleregisterService.loginToSystem("sametakca@gmail.com", "123456");

		
		System.out.println("\n***** Facabook ile Giris ******");
		RegisterService FacebookregisterService=new FacebookRegisterAdapter();
		
		FacebookregisterService.registerToSystem("sametakca@gmail.com", "123456");
		FacebookregisterService.loginToSystem("sametakca@gmail.com", "123456");

		System.out.println("\n***** Github ile Giris ******");
		RegisterService GithubregisterService=new GithubRegisterAdapter();
		
		GithubregisterService.registerToSystem("sametakca@gmail.com", "123456");
		GithubregisterService.loginToSystem("sametakca@gmail.com", "123456");

		
	}

}
