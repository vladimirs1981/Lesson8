package examples;

public abstract class Ghost { 
	
	private String name;
	
	void speak() {
		System.out.println("boo");
	}
	
	abstract void walk();

}
