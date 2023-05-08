package class1;

import java.util.Scanner;

public class Arrayobj {
	
	static int e=0;
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();			
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			if(e<arr[i]) {
				e=arr[i];
			}			
		}
		System.out.println(e);
		
	}

}
