package jukeboxpkg;

import java.util.ArrayList;
import java.util.List;

/**
 * Database is a Database class 
 * @author George Peter (gpeter@yahoo.com)
 * @version 0.1 13 Feb 2019
 */
public class Database {

	/** The song list. */
	List<Song> songList;

	/**
	 * Instantiates a new database.
	 */
	Database(){
		this.songList=new ArrayList<Song>();
	}

	/**
	 * Instantiates a new database.
	 *
	 * @param songList the song list
	 */
	Database(List<Song> songList){
		this.songList=songList;
	}

	/**
	 * Gets the song list.
	 *
	 * @return the song list
	 */
	public List<Song> getSongList() {
		return songList;
	}

	/**
	 * Gets the song list.
	 *
	 * @param index the index
	 * @return the song list
	 */
	public Song getSongList(int index) {
		if(songList.size()>=index)
			return songList.get(index);
		else
			return null;
	}

	/**
	 * Sets the song list.
	 *
	 * @param songList the new song list
	 */
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty(){
		return this.songList.isEmpty();
	}

	/**
	 * Adds the song.
	 *
	 * @param song the song
	 */
	public void addSong(Song song){
		songList.add(song);
	}

	/**
	 * Removes the song.
	 *
	 * @param song the song
	 */
	public void removeSong(Song song){
		if(songList.contains(song)){
			songList.remove(song);
		}
	}

	/**
	 * Removes the song.
	 *
	 * @param index the index
	 */
	public void removeSong(int index){
		songList.remove(index);
	}

	/**
	 * Trace.
	 *
	 * @param s the s
	 */
	private void trace(String s){
		System.out.println(s);
	}

	public String toString(){   
		System.out.println("Song List:\n================");
		for(int i=0;i<songList.size();i++){
			trace(i+":\t"+songList.get(i).toString());
		}
		return "";
	}

	// Henry's comment
	/**
	 * Play.
	 *
	 * @param index the index
	 */
	//   Database does not need to have the functionality of play.
	public void play(int index){
		System.out.println("Playing Song : "+ songList.get(index).toString());
		songList.get(index).play();
	}

	/**
	 * Play.
	 */
	public void play(){
		for(int index=0;index<songList.size();index++)
			play(index);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	//Driver
	public static void main(String[] args){
		Song song1=new Song("Kadhal Cricket", "Kharesma Ravichandran", 
				"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		Song song2=new Song("Kannala Kannala", "Kaushik Krish", 
				"Thani Oruvan", "Kannala.mp3", "Mp3", 215);
		Song song3=new Song("Kadhal Cricket", "Kharesma Ravichandran",
				"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
		List<Song> tempSongList= new ArrayList<Song>();
		tempSongList.add(song2);
		tempSongList.add(song1);

		Database tempDB= new Database(tempSongList);

		tempDB.toString();
		System.out.println("\nAdding Song ");
		tempDB.addSong(song3);
		tempDB.toString();
		System.out.println("Playing Complete SongList");
		tempDB.play();

		System.out.println("Playing Song @ index 2");
		tempDB.play(2);
	}   
}