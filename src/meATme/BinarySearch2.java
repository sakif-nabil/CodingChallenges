package meATme;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		 int size= 1000000;
		 int [] numbers= new int[size];
		 for(int i=0; i<size;i++) {
			 numbers[i]=i+1;
		 }
		 System.out.println("Give a number");
		 Scanner sc= new Scanner(System.in);
		 int searchNumber= sc.nextInt();
		 int low=0;
		 int high=numbers.length-1;
		 int mid=0;
		 int c=0;
		 boolean isFound=false;
		 while(!isFound) {
			 if(low>high) {
				 System.out.println("number not found");
				 break;
			 }
			 mid=low+((high-low)/2);
			 c++;
			 
			 if(numbers[mid] == searchNumber) {
				 System.out.println("number found");
				 System.out.println("the number was found after "+c+" try");
				 break;
			 }
			 if(numbers[mid]>searchNumber) {
				high=mid-1;
			 }
			 if(numbers[mid]<searchNumber) {
				 low=mid+1;
				 
			 }
		 }
		 
		 
	}

}
