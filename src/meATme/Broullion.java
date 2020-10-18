package meATme;

import java.util.Scanner;

public class Broullion {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
                
	      for (int i = 0; i < C; i++) {
	    	  int fact=1;
	    	 
	                    int a = sc.nextInt();
	                    for(int j=1;j<=a;j++){    
	                        fact=fact*j;    
	                    }  
	                    if(a==0 && a==0) {
	                    	System.out.println(1);
	                    }else if(a==2){
	                    	System.out.println(2);
	                    	
	                    }else if(a==3){
	                    	System.out.println(6);
	                    	
	                    }else if(a==4){
	                    	System.out.println(4);
	                    	
	                    }else if(a>=5){
	                    	System.out.println(0);
	                    	
	                    }
	                    
	  	              
	          
	            }

	}

}
