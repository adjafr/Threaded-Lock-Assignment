package day4b;

public class DeadLockMain
{

	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new DeadLockCustom("A"));
		Thread t2 = new Thread(new DeadLockCustom("B"));
		Thread t3 = new Thread(new DeadLockCustom("C"));
			t1.start();
			t2.start();
			t3.start();

			t1.join();
			t2.join();
			t3.join();

	}

}
