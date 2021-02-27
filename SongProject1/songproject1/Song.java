//Austin Gilbert

//Definition of Song object for the song's creation and modifying
package songproject1;

import java.util.ArrayList;

public class Song 
{
	private String track_id;			//6-digit id
	private String artist_name;			
	private ArrayList<String> genre;
	private String track_title;
	private String album_title;
	private String year_created;
	private String artist_longitude;
	
	
	//default constructor
	public Song() 
	{
		track_id = "000000";
		artist_name = "Not Known";
		genre = new ArrayList<String>();
		track_title = "Not Known";
		album_title = "Not Known";
		year_created = "Not Known";
		artist_longitude = "Not Known";
	}
	
	//overloaded constructor
	public Song(String track_id, String artist_name, String track_title, String album_title, String year_created, String artist_longitude) 
	{
		this.track_id = track_id;
		this.artist_name = artist_name;
		this.genre = new ArrayList<String>();
		this.track_title = track_title;
		this.album_title = album_title;
		this.year_created = year_created;
		this.artist_longitude = artist_longitude;
	}
	
	//set the track id
	public void setTrackId(String track_id) 
	{
		this.track_id = track_id;
	}
	
	//set the artist name
	public void setArtistName(String artist_name) 
	{
		this.artist_name = artist_name;
	}
	
	//add the genre to the list
	public void addGenre(String genre)
	{
		if(!this.genre.contains(genre)) 
		{
			this.genre.add(genre);
		}
	}
	
	//set the track title
	public void setTrackTitle(String track_title)
	{
		this.track_title = track_title;
	}
	
	//set the album title
	public void setAlbumTitle(String album_title) 
	{
		this.album_title = album_title;
	}
	
	//set the year the song was created
	public void setYearCreated(String year_created) 
	{
		this.year_created = year_created;
	}
	
	//set the artist longitude
	public void setArtistLongitude(String artist_longitude) 
	{
		this.artist_longitude = artist_longitude;
	}
	
	//string representation of the genre array
	public String genreToString() 
	{
		String toReturn = new String();
		if(genre.size() > 0) 
		{
			for (int i = 0; i < genre.size(); i++) 
			{
				toReturn+= ", " + genre.get(i);
			}
		}
		
		return toReturn + ", ";
	}
	
	//return the track id
	public String getTrackId() 
	{
		return track_id;
	}

	//return the artist name
	public String getArtistName() 
	{
		return artist_name;
	}
	
	//return the genre of the song
	public ArrayList<String> getGenre()
	{
		return genre;
	}
	
	//return track title, album title, year created, artist longitude
	public String getTrackTitle() 
	{
		return track_title;
	}
	
	//return album title
	public String getAlbumTitle()
	{
		return album_title;
	}
	
	//return the year the song was created
	public String getYearCreated() 
	{
		return year_created;
	}
	
	//return the artist longitude
	public String getArtistLongitude()
	{
		return artist_longitude;
	}
	
	//to compare two songs track_id's and see if they are the same
	public boolean compare(Song rhs)
	{
		return track_id.equals(rhs.getTrackId());
	}
	
	//String representation of a Song
	public String toString() 
	{
		return track_id + ", " + artist_name + genreToString() + track_title + ", " + album_title + ", " + year_created + ", " + artist_longitude;
	}
	
}
