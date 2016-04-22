package Eukaryote;

public interface Living {
	//an interface has methods that are abstract by default
	//other classes can implement multiple interfaces
	
	//remember that abstract methods must be overridden
	
	public void setName(String name);
	public String getName();
	
	public void setWeight(double weight);
	public double getWeight();
	
	public void setHeight(double height);
	public double getHeight();
	
	public void setFavFood(String food);
	public String getFavFood();
	
	public void setSpeed(double speed);
	public double getSpeed();
	
	public void setSound(String sound);
	public String getSound();
	
	

}
