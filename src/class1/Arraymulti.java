package class1;

public class Arraymulti {
	
	int[] intArray= {34,45,3,234,243,2};
	//String[] str="gaurav";
	//char[] chr= {'w','r','t','y'};
	
	public static void main(String[] args) {
		
		Arraymulti am=new Arraymulti();
		//am.arrayReturnMethod();
		//am.catchArray();
		am.loop();
		
	}
	
	public int[] arrayReturnMethod() {
		for(int i:intArray) {
			System.out.println("integer array are: "+i);
		
		}
		return intArray;
		
	}
	
	public void catchArray() {
		int[] catchArray=arrayReturnMethod();
		for(int i:catchArray) {
			System.out.print("catch array values are:"+ i);
		}
	}
	
	public void loop() {
		int i,j;
		for(i=1;i<=6;i++) {
			System.out.println("Ayush"+i);
			System.out.print("Ishank=");
			
			for(j=1;j<=5;j++) {
				System.out.print(j);
				System.out.print(",");
			}
			System.out.println(j);
		}
	}

}
