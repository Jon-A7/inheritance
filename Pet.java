package mavenInheritance;

public class Pet {
	

	public void makeNoise() {
		System.out.println("We making noise cuh");
		
	}
	
	public void doThing() {
		System.out.println("Watch me do how I do");
		
	}
	
	public static void main(String[] args) {
	Dog doge = new Dog();
	Cat beluga = new Cat();
	
	beluga.makeNoise();
	doge.makeNoise();
	beluga.doThing();
	doge.doThing();
	
	beluga.setLives(9001);
	System.out.println(beluga + "has " + beluga.getLives() + " lives, it's over 9000!");
	}

}
