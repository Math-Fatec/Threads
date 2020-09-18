package Thread;

import java.awt.event.ActionEvent;

public class Aplication extends Thread {

	private void Aplic() {
		 Thread t1 = new Thread();
		  Thread t2 = new Thread();
		   Thread t3 = new Thread();
		    Thread t4 = new Thread();
		     Thread t5 = new Thread();
		 t1.start();
		 System.out.println("N°1");
		  t2.start();
		  System.out.println("N°2");
		   t3.start();
		   System.out.println("N°3");
		    t4.start();
		    System.out.println("N°4");
		     t5.start();
		     System.out.println("N°5");
	}
	
	@Override
	 public void actionPerformed(ActionEvent e) {
		Aplic();
	}
}