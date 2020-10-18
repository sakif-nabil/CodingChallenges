package meATme;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
         Scanner sc = new Scanner(System.in);
         int C = sc.nextInt();
                 
	      for (int i = 0; i < C; i++) {
	    	  int fact=1; 
	    	 
	                    int a = sc.nextInt();
	                    
	  	              System.out.println("C="+C);
	  	              
		              System.out.println("a="+a);
	                            for(int j=1;j<=a;j++){    
			                        fact=fact*j;
			                              } 
	                            
	              System.out.println(fact);
	          
	            }

		 }  

}
 