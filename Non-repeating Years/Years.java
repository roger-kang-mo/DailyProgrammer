import java.util.HashSet;

public class Years {

	public static void main(String[] args){
		String[] yearSets = new String[]{"1980,1987", "1992,1994", "1901,1801"};
		int comma = 0;
		String floor, ceil;

		for(String pair : yearSets){
			comma = pair.indexOf(',');
			floor = pair.substring(0,comma);
			ceil = pair.substring(comma+1);

			if(!verify(floor, ceil))
				System.out.println("Come on, really?");
			else
				System.out.println("Output for " + pair + ":\t" + countem(floor, ceil));
		}
	}

	public static boolean verify(String floor, String ceil){
		return Integer.parseInt(floor) < Integer.parseInt(ceil);
	}

	public static int countem(String floor, String ceil){
		int retVal = 0;
		String currentYear = "";
		HashSet<Character> charSet = new HashSet<Character>();

		// I do it this way at times because then parseInt on ceil will only be called once.
		for(int i = Integer.parseInt(floor), j = Integer.parseInt(ceil); i <= j; i++){
			currentYear = ""+i;
			for(char c : currentYear.toCharArray()){
				charSet.add(c);
			}

			if(charSet.size() == currentYear.length())
				retVal++;

			charSet.clear();
		}		

		return retVal;
	}


}