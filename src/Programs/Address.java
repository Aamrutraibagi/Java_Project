package Programs;

public class Address {
	class HomeAddress{
		void printHomeAddress() {
			System.out.println("This is home Address");
		}
	}
	
	static class OfficeAddress{
		void printOfficAddress() {
			System.out.println("This is office Address");
		}
	}

}
class Person1{
	public static void main(String[] args) {
		String name="Amrut Raibagi";
		int age=23;
		String HomeAddress="Gajendragad";
		
		Address A=new Address();
		Address.HomeAddress H=A.new HomeAddress();
		H.printHomeAddress();
		Address.OfficeAddress O=new Address.OfficeAddress();
		O.printOfficAddress();
	}
	
}
