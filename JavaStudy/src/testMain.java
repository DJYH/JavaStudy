
//testMain Thread
public class testMain {
	public static BankAccount account = new BankAccount();
	
	public static void main (String []args) {
		Thread depositMan = new Thread() {
			@Override
			public void run() {
				account.add(10);
			}
		};
		Thread withdrawMan = new Thread() {
			@Override
			public void run() {
				account.delete(10);
			}
		};
		depositMan.start();
		withdrawMan.start();
	}
}
