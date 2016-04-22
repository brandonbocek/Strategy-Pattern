package Eukaryote;

public class Dog extends Animal{

	public void digHole(){
		System.out.println("Dug a hole");
	}
	public Dog(){
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}
	
	private void bePrivate(){
		System.out.println("I'm a private method outside of main");
	}
	public void accessPrivate(){
		bePrivate();
	}
}
