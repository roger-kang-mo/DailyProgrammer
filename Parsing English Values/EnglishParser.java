import java.io.*;
import java.util.*;

public class EnglishParser {

	private List<Pair> values;

	public EnglishParser(){
		values = new ArrayList<Pair>();
	}

	private void setupPairs(){
		values.add(new Pair(1, "one"));
		values.add(new Pair(2,"two"));
		values.add(new Pair(3,"three"));
		values.add(new Pair(4,"four"));
		values.add(new Pair(5,"five"));
		values.add(new Pair(6,"six"));
		values.add(new Pair(7,"seven"));
		values.add(new Pair(8,"eight"));
		values.add(new Pair(9,"nine"));
		values.add(new Pair(10,"ten"));
		values.add(new Pair(11,"eleven"));
		values.add(new Pair(12,"twelve"));
		values.add(new Pair(13,"thirteen"));
		values.add(new Pair(14,"fourteen"));
		values.add(new Pair(15,"fifteen"));
		values.add(new Pair(16,"sixteen"));
		values.add(new Pair(17,"seventeen"));
		values.add(new Pair(18,"eighteen"));
		values.add(new Pair(19,"nineteen"));
		values.add(new Pair(20,"twenty"));
		values.add(new Pair(30,"thirty"));
		values.add(new Pair(40,"fourty"));
		values.add(new Pair(50,"fifty"));
		values.add(new Pair(60,"sixty"));
		values.add(new Pair(70,"seventy"));
		values.add(new Pair(80,"eighty"));
		values.add(new Pair(90,"ninety"));
		values.add(new Pair(100,"hundred", true));
		values.add(new Pair(1000,"thousand", true));
	}

	public class Pair {
		
		private int value;
		private String english;
		private boolean isMagnitude;

		public Pair(int val, String num){
			value = val;
			english = num;
			isMagnitude = false;
		}

		public Pair(int val, String num, boolean isMag){
			value = val;
			english = num;
			isMagnitude = isMag;
		}

		public String getEnglish(){
			return english;
		}

		public int getValue(){
			return value;
		}

		public boolean getIsMagnitude(){
			return isMagnitude;
		}
	}
}
