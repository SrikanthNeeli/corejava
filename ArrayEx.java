package array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int ar[]=new int[4];
		Scanner sc=new Scanner(System.in);            //Example 1 to print the max number in given array
		System.out.println("Enter any 4 numbers: ");
		for(int i=0;i<4;i++) {
			ar[i]=sc.nextInt();
		
		}int max=ar[0];
	   for(int i=0;i<4;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}System.out.println(max);
			
		}
		
		
		

	}


