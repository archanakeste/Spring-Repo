/*

My application is responsible to initialize the Email Service and use it this is hard coded Dependency Injection.
tightly coupled   


*/
public class MyApplication {
	EmailService emailService=new EmailService();
	public void proccessMailService(String message,String mailId){
		emailService.sendMail(message, mailId);
	}

}
