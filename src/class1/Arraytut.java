package class1;

public class Arraytut {
	
	public static void main(String[] args) {
		try {
		int[] arr= {1,2,13,14,15};
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("change for loop condition");
		}
	}

}
