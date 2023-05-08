package class1;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatch tc=new TryCatch();
		tc.nullStringCheck();

	}
	
	public void nullStringCheck() {
		try {
			String str= null;
			System.out.println(str.charAt(0));
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("exception is "+nullPointerException);
		}
	}

}
