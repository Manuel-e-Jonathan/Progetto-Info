package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetturaDaFile
{


	public static ArrayList<String> readFile() throws FileNotFoundException, IOException
	{
		ArrayList<String> mappe = new ArrayList<String>();
		
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(new FileReader("D:\\Progetto\\prova.txt"));
        String line = reader.readLine();
        while(line!=null)
        {
            line = reader.readLine();
        }
        
        return mappe;
	}
	
}