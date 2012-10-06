package src;

public class Item{
	
	private String description;
	private boolean isClue;
	private int atkDmg;

	public Item(String desc, boolean clue, int damage){
		description = desc;
		isClue = clue;
		atkDmg = damage;
	}

	public String getDescription(){
		return description;
	}

	public boolean getIsClue(){
		return isClue;
	}

	public void setDamage(int newDamage){
		atkDmg = newDamage;
	}

	public int getDamage(){
		return atkDmg;
	}

}