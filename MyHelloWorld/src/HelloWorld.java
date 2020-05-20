import com.service.message.MessageService;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * LongWrapper longw = new LongWrapper(0L);
		 * 
		 * Runnable runnable = () -> { for(int i=0;i<1_000;i++) { longw.increment(); }
		 * };
		 * 
		 * Thread t1 =new Thread(runnable); t1.setName("MyName"); t1.start(); t1.join();
		 * System.out.println(longw.getValue());
		 */

		/*
		 * A a = new A();
		 * 
		 * Runnable r1 = () -> a.a(); Runnable r2 = () -> a.b(); Thread t1 =new
		 * Thread(r1); Thread t2 =new Thread(r2); t1.start(); t2.start();
		 * 
		 * t1.join(); t2.join();
		 */
		String message = MessageService.getMessage();
		System.out.println(message);
	}
}
