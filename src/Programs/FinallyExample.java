package Programs;

public class FinallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
		}
		catch(ArithmeticException e) {
			System.out.println("eXCEPTION Handeled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally block always executrd");
		}
		System.out.println("rest of code");
	}

}
