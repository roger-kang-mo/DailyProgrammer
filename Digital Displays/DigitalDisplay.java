import java.util.*;

/******************************************************
   + +--+ +--+ +  + +--+ +--+ +--+ +--+ +--+ +--+ 
   |    |    | |  | |    |       | |  | |  | |  | 
   |    |    | |  | |    |       | |  | |  | |  | 
   + +--+ +--+ +--+ +--+ +--+    + +--+ +--+ +  + 
   | |       |    |    | |  |    | |  |    | |  | 
   | |       |    |    | |  |    | |  |    | |  | 
   + +--+ +--+    + +--+ +--+    + +--+ +--+ +--+
*********************************************************/

class DigitalDisplay{
	private HashMap<String, String> dict;

	public static void main(String[] args){
		new DigitalDisplay();
	}

	public DigitalDisplay(){
		dict = new HashMap<String, String>(10);
		setupDictionary();
		
		StringBuilder str = new StringBuilder();

		String[] nums = new String[7];
		nums[0] = "+ +--+ +--+ +  + +--+ +--+ +--+ +--+ +--+ +--+";
		nums[1] = "|    |    | |  | |    |       | |  | |  | |  |";
		nums[2] = "|    |    | |  | |    |       | |  | |  | |  |";
		nums[3] = "+ +--+ +--+ +--+ +--+ +--+    + +--+ +--+ +  +";
		nums[4] = "| |       |    |    | |  |    | |  |    | |  |";
		nums[5] = "| |       |    |    | |  |    | |  |    | |  |";
		nums[6] = "+ +--+ +--+    + +--+ +--+    + +--+ +--+ +--+";

		for(String line : splitNums(nums))
			str.append(parseNumber(line));

		System.out.println(str.toString());

		String numToConvert = "23478";
		System.out.println("Converting " + numToConvert + " to digital display: ");
		for(String line : convertToDigitalDisplay(numToConvert))
			System.out.println(line);
	}

	private String[] convertToDigitalDisplay(String nums){
		String[] digitalDisplay = new String[]{"","","","","","",""};

		for(int i = 0; i < nums.length(); i++){
			digitalDisplay = addNum(digitalDisplay, ""+nums.charAt(i));
		}

		return digitalDisplay;
	}

	private ArrayList<String> splitNums(String[] nums){
		ArrayList<String> retVal = new ArrayList<String>();
		String line = nums[nums.length-1];
		int last = 0;
		StringBuilder str = new StringBuilder("");

		for(int i = 0; i < line.length(); i++){
			if((line.charAt(i) == '+' && i+1 == line.length())
				|| (line.charAt(i) == '+' && line.charAt(i+1) == ' ')){
				for(int j = 0; j < nums.length; j++){
					str.append(nums[j].substring(last, i+1) + ',');
				}

				retVal.add(str.toString().substring(0,str.length()-1).trim());
				last = i+2;
				str.setLength(0);
			}
		}

		return retVal;
	}

	private String parseNumber(String num){
		return dict.get(num);	
	}

	private String[] addNum(String[] display, String num){
		String[] parts = dict.get(num).split(",");

		for(int i = 0; i < display.length; i++){
			display[i] += " " + parts[i];
		}


		return display;
	}

	private void setupDictionary(){
		dict.put("+,|,|,+,|,|,+", "1");
		dict.put("+--+,   |,   |,+--+,|   ,|   ,+--+", "2");
		dict.put("+--+,   |,   |,+--+,   |,   |,+--+", "3");
		dict.put("+  +,|  |,|  |,+--+,   |,   |,   +", "4");
		dict.put("+--+,|   ,|   ,+--+,   |,   |,+--+", "5");
		dict.put("+--+,|   ,|   ,+--+,|  |,|  |,+--+", "6");
		dict.put("+--+,   |,   |,   +,   |,   |,   +", "7");
		dict.put("+--+,|  |,|  |,+--+,|  |,|  |,+--+", "8");
		dict.put("+--+,|  |,|  |,+--+,   |,   |,+--+", "9");
		dict.put("+--+,|  |,|  |,+  +,|  |,|  |,+--+", "0");
		dict.put("1", "+,|,|,+,|,|,+");
		dict.put("2", "+--+,   |,   |,+--+,|   ,|   ,+--+");
		dict.put("3", "+--+,   |,   |,+--+,   |,   |,+--+");
		dict.put("4", "+  +,|  |,|  |,+--+,   |,   |,   +");
		dict.put("5", "+--+,|   ,|   ,+--+,   |,   |,+--+");
		dict.put("6", "+--+,|   ,|   ,+--+,|  |,|  |,+--+");
		dict.put("7", "+--+,   |,   |,   +,   |,   |,   +");
		dict.put("8", "+--+,|  |,|  |,+--+,|  |,|  |,+--+");
		dict.put("9", "+--+,|  |,|  |,+--+,   |,   |,+--+");
		dict.put("0", "+--+,|  |,|  |,+  +,|  |,|  |,+--+");
	}

}