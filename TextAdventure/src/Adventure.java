package src;

import java.io.*;
import java.util.*;


/**
* ZORK?
*/
public class Adventure{
	
	private HashMap<String, Room> rooms;

	public Adventure(String fileName){
		rooms = new HashMap<String, Room>();

		
		createBoard(fileName);
		// while ((line = buffReader.readLine()) != null){
		// 	String[] parts = line.trim().split(" ");
			
		// 	for(int i = 0; i < parts.length; i++){
		//
		// 	}
		// }
	}

	private void createBoard(String fileName){

		try{
			FileInputStream fileStream = new FileInputStream(fileName + ".txt");
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(fileStream));
			ArrayList<String> lines = new ArrayList<String>();
			String line = "";
			
			while ((line = buffReader.readLine()) != null){
				if(line.length() > 0)
					lines.add(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}




}