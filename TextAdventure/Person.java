import java.util.ArrayList;

class Person{
	
	private int damage;
	private String[] messages;
	private boolean isEnemy;
	private boolean isKiller;

	public Person(String[] pMessages){
		damage = 0;
		isEnemy = false;
		isKiller = false;
		messages = pMessages;
	}

	public Person(int pDamage, String[] pMessages, boolean killer){
		damage = pDamage;
		messages = pMessages;
		isKiller = killer;
	}

	public int getDamage(){
		return damage;
	}

	public String[] getMessages(){
		return messages;
	}

	public boolean getIsKiller(){
		return isKiller;
	}

	public boolean getIsEnemy(){
		return isEnemy;
	}

}