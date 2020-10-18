package meATme;

import java.util.Scanner;

public class CovidAlert {

	
	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			String a= sc.nextLine();
			if(a.contains("c")) {
				System.out.println("Stay Home");
			} else {
				System.out.println("Safe");
			}
	
		
		

	}

}
