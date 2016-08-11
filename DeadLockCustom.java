package day4b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockCustom implements Runnable


{
	private static Lock lock = new ReentrantLock();
	private String letter;


	private static AtomicInteger counter = new AtomicInteger(0);


	public DeadLockCustom(String letter)
	{
		super();
		this.letter = letter;
	}



	public String getLetter()
	{
		return letter;
	}



	public void setLetter(String letter)
	{
		this.letter = letter;
	}



	@Override
	public void run()
	{
		synchronized(lock){
		for(int i = 0; i< 10; i++)
		{
			
			int temp = (counter.incrementAndGet() % 3);
			switch(temp){
				case 1:
					System.out.println("A \t");
				break;
				case 2:
					System.out.println("B \t");
				break;
				case 0:
					System.out.println("C \t");
				break;
			}
			}
			
		}



		
	}
	
	

}
