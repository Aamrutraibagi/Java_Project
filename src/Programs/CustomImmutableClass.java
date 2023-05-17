package Programs;

final class CustomImmutableClass {
	private int i;
	CustomImmutableClass(int i){
		this.i=i;
	}
	
	public CustomImmutableClass modify(int i) {
		if(this.i==i) {
			return this;
		}
		else {
			return new CustomImmutableClass(i);
		}
	}
	public static void main(String[] args) {
		CustomImmutableClass C1=new CustomImmutableClass(10);
		CustomImmutableClass C2=C1.modify(100);
		CustomImmutableClass C3=C1.modify(10);
		
		System.out.println(C1==C2);
		System.out.println(C1==C3);
	}

}
