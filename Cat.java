package mavenInheritance;

public class Cat extends Pet{
	@Override
	public void makeNoise() {
		System.out.println("Meow");
	}
	@Override
	public void doThing() {
		System.out.println("The cat scrathes the post");
	}
	
	private int lives = 9;
	
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	@Override
	public String toString() {
		return "This cat ";
	}

}
