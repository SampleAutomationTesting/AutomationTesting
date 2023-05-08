package class1;

public class Pract1 {
	public static void main(String[] args) {
		
		Pract1 pract=new Pract1();
		pract.stringMethd();
		
	}
	
	private void stringMethd() {
		StringBuilder str1=new StringBuilder("gaurav");
		str1.append(" chauhan");
		System.out.println(str1);
		str1.reverse();
		System.out.println(str1);
	}

}
