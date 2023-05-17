package Programs;
class Amazon{
	void product() {
		System.out.println("Product");
	}
}

class cust1{
	static void needProduct(Amazon a2) {
		a2.product();
	}
}

public class FedEx {
	public static void main(String[] args) {
		Amazon a1=new Amazon();
		cust1.needProduct(a1);
	}

}
