package meATme;

import java.util.Random;
import java.util.Scanner;

public class jeusimple {

	public static void main(String[] args) {
	
		
int comp=0;
		
		Random r= new Random();
		int a= r.nextInt(100)+1;
		
		do {
			System.out.println("donner un nombre");
			Scanner sc= new Scanner(System.in);
			int b= sc.nextInt();
		comp++;
		if(b<a) {
			System.out.println("le nombre est petit");
		}else if (a<b) {
			System.out.println("le nombre est grand");
			
		}
		else {
			System.out.println("bravo dans "+comp);
		}
		}while(a>0);
		
		// method for calculate the summons 
		

		
	
	
	}
}
