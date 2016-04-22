package Eukaryote;

public class Giraffe extends Creature{

	private String name;
	private int weight;
	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		name=newName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setWeight(int newWeight) {
		// TODO Auto-generated method stub
		weight=newWeight;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	

}
