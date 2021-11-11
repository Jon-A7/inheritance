package mavenInheritance;

public class Dog extends Pet {
	@Override
	public void makeNoise() {
		System.out.println("Woof");
	}
	
	public void doThing() {
		System.out.println("The dog chases its tail");
	}
}
