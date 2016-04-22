package Eukaryote;

public class PlayWithAnimals {
	
	int justANum = 10;

	public static void main(String[] args){
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		fido.setWeight(-1);
		System.out.println("Fido tries to fly with negative weight "+fido.tryToFly());
		
		changeObjectName(fido);
		System.out.println("Dog's name after call is "+fido.getName());
		
		//you called the dog and cat as an Animal so you can't use their subclass methods
		//unless you cast them as a dog or cat
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: "+doggy.getSound());
		System.out.println("Kitty says: "+kitty.getSound());
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("Doggy says: "+animals[0].getSound());
		System.out.println("Kitty says: "+animals[1].getSound());
		
		speakAnimal(doggy);
		((Dog)doggy).digHole();
		
		fido.accessPrivate();
		
		Giraffe frank = new Giraffe();
		frank.setName("Frank");
		System.out.println("The giraffe's name is "+frank.getName());
		
		
		//composition is used to make animals fly
		Bird tweety = new Bird();
		System.out.println("Dog "+fido.tryToFly());
		System.out.println("Bird "+tweety.tryToFly());
		
		fido.setFlyingAbility(new ItFlys());
		System.out.println("Dog "+fido.tryToFly());
		
	}
	public static void changeObjectName(Animal fido){
		fido.setName("Marcus");
	}
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says: "+randAnimal.getSound());
	}
	
}
