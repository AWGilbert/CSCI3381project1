package songproject1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Library 
{
	private ArrayList<Song> library;
	private String filename;
	
	//default constructor
	public Library() 
	{
		library = new ArrayList<Song>();
		filename = null;
	}
	
	//constructor with 1 argument
	public Library(String filename)
	{
		this();
		this.filename = filename;
		readFile();
		
	}

	private void readFile() 
	{
		
			
	}

}
