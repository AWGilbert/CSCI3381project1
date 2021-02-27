//Austin Gilbert

//a program to test the implementation of Song and Library
package songproject1;

public class Tester 
{

	//DRIVER for the test
	public static void main(String[] args) 
	{
		//const variable to store the name of the file which stores data
		final String FILE = "finalTracks.csv";

		//Testing Song
		//test the constructors
		Song test1 = new Song();
		Song test2 = new Song("078654","Bruno Mars","Grenade","Doo-Wops & Hooligans", "2010", "0");
		
		//testing setters and toString
		test1.setTrackId("000378");
		test1.setArtistName("Train");
		test1.setTrackTitle("Drops of Jupiter");
		test1.setAlbumTitle("Drops of Jupiter");
		test1.setYearCreated("2001");
		test1.setArtistLongitude("75.92");
		
		//add a genre to test1
		test1.addGenre("Pop");
		test1.addGenre("Electronic Dance Music");
		
		System.out.println(test1 + "\n");
		
		//testing getters
		System.out.println("Track ID: " + test2.getTrackId());
		System.out.println("Artist: " + test2.getArtistName());
		System.out.println("Track Title: " + test2.getTrackTitle());
		System.out.println("Album Title: " + test2.getAlbumTitle());
		System.out.println("Year Created: " + test2.getYearCreated());
		System.out.println("Longitude: " + test2.getArtistLongitude());
		System.out.println("Genre(s): " + test2.getGenre());
		
		//test the compare method of the track id's
		System.out.println("\nSong 1 equals Song 2: " + test1.compare(test2) + " [expect false] \n");
		
		
		//Test the library class
		//Test the constructor
		Library library = new Library(FILE);
		
		
	}

}
