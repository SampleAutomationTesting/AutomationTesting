package class1;

public class Overloading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Overloading overloading=new Overloading();
		System.out.println(overloading.add(2.4, 6.6));
		System.out.println(overloading.add(2, 4));
		System.out.println(overloading.add(1, 2, 5));
		

	}
	public int add(int a, int b) {
		return a+b;
	
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}

}
