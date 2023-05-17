package Programs;

public class AllStringMethod {
	public static void main(String[] args) {
		String a="AMRUT";
		String b="manish";
		
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		
		System.out.println(b.concat(a));
		System.out.println(b.length());
		
		String c="    My Name is Uday     ";
		String d="";
		
		System.out.println(c.trim());
		System.out.println(d.isEmpty());
		
		System.out.println(a.charAt(2));
		System.out.println(b.indexOf('i'));
		
		System.out.println(a.equals(b));
		System.out.println(b.replace('a','u'));
	}

}
