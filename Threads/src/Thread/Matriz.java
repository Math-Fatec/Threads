package Thread;

import java.util.Random;

public class Matriz extends Thread{
	int i = 0;
	
	int [][]m = new int [3][5];
	
	for(int i = 0; i < 3 ; i++){
	 for(int k = 0; k < 5 ; i++){
		Random generator = new Random();
		 m[i][k] = generator.nextInt( 10 );
		 
		    Thread t1 = new Thread();
			Thread t2 = new Thread();
			Thread t3 = new Thread();
			
		System.out.println (m[i][k]);
   }	  
  }
 }
}