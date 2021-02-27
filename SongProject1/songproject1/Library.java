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

	private void readFile() {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(filename);
			lineReader = new BufferedReader(fr);
			String line = null;
			while((line = lineReader.readLine())!=null)
			{
				String[] tokens = line.split(";");
				Song temp = new Song(tokens[0], tokens[1], tokens[2],)
			}
	}

}
