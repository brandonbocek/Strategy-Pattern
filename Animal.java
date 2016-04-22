package Eukaryote;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String sound;
	public Flys flyingType;
	
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	public void setHeight(double height){this.height=height;}
	public double getHeight(){return height;}
	public void setWeight(int weight){
		if(weight>0){
			this.weight=weight;
			
		}
		else{
			System.out.println("Weight must be bigger than 0");
			this.setFlyingAbility(new ItFlys());
		}
	}
	public int getWeight(){return weight;}
	public void setSound(String sound){this.sound=sound;}
	public String getSound(){return sound;}
	
	public String tryToFly(){
		return flyingType.Flys();
	}
	public void setFlyingAbility(Flys ability){
		flyingType=ability;
	}
}
