# JavaProject5GunOdev


JAVA &amp; REACT KAMPI 5. Gun ödevi - SystemOfECommerce

<H2> SMTcoder </H2>



Projeye yıldız Vermeyi Unutmayın  🚀
Teşekkürler! ❤️



Entites katmanında, User classında id,name,lastname,email ve password bulunmaktadır. User classı Entity adında interfasten implement edilmiştir.

DataAccess katmanında, UserDao adında bir interface bulunmaktadır ve HibernateUserDao bu interfacei implement etmektedir. HibernateUserDao içerisinde, User tipinde bir liste bulunmakta ve register olanlar bu listeye eklenmektedir.

Business katmanında, UserService adında bir interface bulunmaktadır ve UserManager bu interface’yi implement etmektedir. UserManager içerisinde üyelerin(user) register olurken ki şartları (user bilgileri bos olmamalı, şifre en az 6 karakter olmalı, var olan email olmamalı, email içerisinde @ durum kontrolü-regex- ve ad ve soyad en az 2 karakter olmalı) bulunmaktadır. Ve login olurken email ve şifre boş olmama durum kontrolü bulunmaktadır. Bunun yanında bir tane user doğrulama için UserValidateService adında bir interface bulunmaktadır. Doğrulama yöntemine göre (senaryoda Email ile) bir tane EmailValidateManager class’ı oluşturdum UserValidateService’i implement etmektedir. Register işlemi sırasında UserValidateService’yi de çağırarak doğrulama işlemini simüle etmekte. (ekranda doğrulandı mesajı direk yazar)

GoogleRegister için(dış servis kullanımı), Core katmanı içerisinde bir tane RegisterService interface’i oluşturup GoogleRegisterAdapter classını bu interfaceden implement ettim. Main içerisinde, RegisterService tipinde bir GoogleRegisterAdapter oluşturarak Google ile register olmayı yaptım. 

Eksik veya yanlış yapılan bir yer olabilir geri dönüş sağlarsanız sevinirim.

<h3> <a href="https://sametakca.com/">  web sitem </a> </h3> 
 
<br> <br>
Sosyal Medya Hesaplarım 😛
<br>

<a href="https://www.instagram.com/smtcoder/">
instagram
</a>
<br>

<a href="https://www.linkedin.com/in/samet-akca-2a4bbb1a8/">
linkedin
</a>
<br>

<a href="https://www.youtube.com/channel/UCZXmqpZJ3ax5Uzm0pXeVqMg">
youtube
</a>

<br>

<a href="https://play.google.com/store/apps/developer?id=Samet+Akca&gl=TR">
Google Play uygulamalarım
</a>

<br>
<br>




Projeye yıldız Vermeyi Unutmayın  🚀
Teşekkürler! ❤️

