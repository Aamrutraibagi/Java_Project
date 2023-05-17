package Programs;

import java.util.LinkedHashSet;
import java.util.Objects;

class Person3{
	private String name;
	private int age;
	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	  @Override 
	  public int hashCode() { 
		  return this.age; 
		  }
	 
	@Override
	public boolean equals(Object obj) {
		//obj is of object class so we can't access name and age of Person1 class with super class object obj,
		//So we go for Downcasting
		Person3 other = (Person3) obj;//downcasting 
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {//used to convert object to String
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	
}
public class ToStringEqualsHashCode {
	public static void main(String[] args) {
		Person3 p1=new Person3("A",20);
		Person3 p2=new Person3("A",20);
		System.out.println(p1==p2);//used to compare object by its address
		
		System.out.println(p1.equals(p2));//used to compare object by its content
		System.out.println("======================");
		
		System.out.println("for toString");
		System.out.println(p1);
		System.out.println("======================");
		
		System.out.println("For LinkedHashSet");
		LinkedHashSet<Person3> people=new LinkedHashSet<>();
		people.add(new Person3("A",20));
		people.add(new Person3("B",25));
		people.add(new Person3("A",20));
		people.add(new Person3("C",30));
		
		for(Person3 p:people)
			System.out.println(p);
	}

}
