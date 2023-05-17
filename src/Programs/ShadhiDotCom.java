package Programs;

class MarraigeException extends RuntimeException {
	String message;
	MarraigeException(String message){
		this.message=message;
	}
	public String getmessage() {
		return message;
	}

}

public class ShadhiDotCom {
	static void valid_age(int age)  {
		if(age>=21) {
			System.out.println("Life Jingala");
		}
		else {
			throw new MarraigeException("invalid age");
		}
	}
	public static void main(String[] args) {
		try {
			valid_age(22);
		}
		catch(MarraigeException e){
			System.out.println(e.getmessage());
		}
	}


}
