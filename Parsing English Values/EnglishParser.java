import java.io.*;
import java.util.*;

/*
http://www.reddit.com/r/dailyprogrammer/comments/zfeb2/9062012_challenge_96_intermediate_parsing_english/

One-Hundred and Ninety-Seven
Seven-Hundred and Forty-Four Million
Twenty-thousand two-hundred and forty-four
Seven-Million 
*/

public class EnglishParser {

	private Map<String, Integer> values;
	private Map<String, Integer> magnitudes;
	private int numValue = 0;

	public EnglishParser(ArrayList<String> inputStrings){
		values = new HashMap<String, Integer>();
		magnitudes = new HashMap<String, Integer>();

		setupMap();

		String[] englishString;

		for(String inputString : inputStrings){
			englishString = inputString.replace(' ', ',').toLowerCase().split(",");

			for(String part : englishString){
				if(!part.equals("and"))
					numValue += parsePart(part);
			}

			System.out.println("Value parses out to: " + numValue);
			numValue = 0;
		}
	}

	public static void main(String[] args){
		ArrayList<String> inputs = new ArrayList<String>();
		inputs.add("One-Hundred and Ninety-Seven");
		inputs.add("Twenty-thousand two-hundred and forty-four");
		inputs.add("Seven-Hundred and Forty-Four Million");

		new EnglishParser(inputs);

	}

	private int parsePart(String part){
		int returnVal = 0;

		String[] pieces = part.split("-");

		returnVal = magnitudes.containsKey(pieces[0]) ? numValue*magnitudes.get(pieces[0]) : returnVal + values.get(pieces[0]);

		if(pieces.length > 1){
			returnVal = magnitudes.containsKey(pieces[1]) ? returnVal*magnitudes.get(pieces[1]) : returnVal + values.get(pieces[1]);
		}
		
		return returnVal;	
	}

	private void setupMap(){
		values.put("one", 1);
		values.put("two", 2);
		values.put("three", 3);
		values.put("four", 4);
		values.put("five", 5);
		values.put("six", 6);
		values.put("seven", 7);
		values.put("eight", 8);
		values.put("nine", 9);
		values.put("ten", 10);
		values.put("eleven", 11);
		values.put("twelve", 12);
		values.put("thirteen", 13);
		values.put("fourteen", 14);
		values.put("fifteen", 15);
		values.put("sixteen", 16);
		values.put("seventeen", 17);
		values.put("eighteen", 18);
		values.put("nineteen", 19);
		values.put("twenty", 20);
		values.put("thirty", 30);
		values.put("forty", 40);
		values.put("fifty", 50);
		values.put("sixty", 60);
		values.put("seventy", 70);
		values.put("eighty", 80);
		values.put("ninety", 90);
		magnitudes.put("hundred", 100);
		magnitudes.put("thousand", 1000);
		magnitudes.put("million", 1000000);
	}
}
