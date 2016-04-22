package Eukaryote;

//by creating an interface for Flying
//many kinds of flying can be implemented but only one can be assigned at a time
//ItFlys and CantFly are encapsulated in the Flys interface
//This is the Strategy Pattern
//It is used when there are a bunch of similar behaviors in a list
//I could also make a FlySlowly class etc

public interface Flys {

	String Flys();
}
class ItFlys implements Flys{

	
	public String Flys() {
		
		return "Flying high";
	}
	
}
class CantFly implements Flys{

	
	public String Flys() {
		
		return "Can't Fly";
	}
	
}
class QuickFly implements Flys{

	
	public String Flys() {
		
		return "I can fly fast";
	}
	
}
