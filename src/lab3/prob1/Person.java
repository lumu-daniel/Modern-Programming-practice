package lab3.prob1;

public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	public static void main(String[] args) {

		Person p1 = new Person("Joe");
		Person p2 = new Person("Joe");
		//As Persons, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));   //output: true
		System.out.println("p2.equals(p1)? " + p2.equals(p1));   //output: true

		
	}

}
