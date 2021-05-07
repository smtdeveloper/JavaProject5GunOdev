package JavaProject5GunOdev.business.concretes;

import java.util.List;

import JavaProject5GunOdev.business.abstracts.UserService;
import JavaProject5GunOdev.business.abstracts.UserValidateService;
import JavaProject5GunOdev.dataAccess.abstracts.UserDao;
import JavaProject5GunOdev.entities.concretes.User;

public class UserManager implements UserService {

	
	private UserDao userDao;
	private UserValidateService userValidateService;
	
	public UserManager(UserDao userDao,UserValidateService userValidateService) {
		super();
		this.userDao = userDao;
		this.userValidateService=userValidateService;
	}

	
	@Override
	public void register(User user) {
		
		if (isInfoNull(user)) {
			if (user.getParola().length()>=6 && emailCheck(user)==true && checkNameAndLastname(user)==true) {
				System.out.println(user.getName()+" , kayit olusturma  basarili. +");
				
				userDao.register(user);
				userValidateService.validate(user);
			}else {
				System.out.println(" ! Kayit olma basarisiz : "  + user.getName() + " , Lütfen Asagidaki sartlari saglayiniz.  " 
						+ "\n1-Sifreniz en az 6 karakter olmalidir "
						+ "\n2-Email daha once kullanilmis olabilir "
						+ "\n3-Adiniz ve Soyadiniz en az 2 karakter olmalidir.");
			}
		}else {
			System.out.println("Lütfen bilgileri bos birakmayiniz!");
		}
		
	}

	@Override
	public void login(User user) {
		if (user.getEmail()!=null && user.getParola()!=null) {
			System.out.println("Giris basarili: "+user.getName());
		}else {
			System.out.println("Email yada sifre eksik.");
		}
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getall();
	}

	private boolean checkNameAndLastname(User user) {
		if (user.getName().length()>2 && user.getLastName().length()>2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isInfoNull(User user) {
		if (user.getName()!="" && user.getLastName()!="" && user.getEmail()!="" && user.getParola()!="" ) {
			 return true;
		}else {
			return false;
		}
	}
	
	private boolean emailCheck(User user) {
		//user.getEmail().matches(".*@.*"); //email içerisinde @ kontrol eder.
		
		if (user.getEmail().matches(".*@.*")==true) {
			return isThereMail(user);
		}else {
			return false;
		}
	}

	private boolean isThereMail(User user) {
		for (var onDataUser: userDao.getall()) {
			if (onDataUser.getEmail()==user.getEmail()) {
				return false;
			}
		}
		return true;
	}
	
}
