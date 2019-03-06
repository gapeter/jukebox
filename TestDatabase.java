package jukeboxpkg;

import jukeboxpkg.Database;

import jukeboxpkg.Song;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestDatabase { 
 
	Database tempDB,testDB;
    private Song testSong1, testSong2, testSong3, testSong4 ;
    
	@Before
	public void setUp() {
		testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
				"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		testSong2 = new Song("Kannala Kannala", "Kaushik Krish", 
				"Thani Oruvan", "Kannala.mp3", "Mp3", 215);
		testSong3 = new Song("Kadhal Cricket", "Kharesma Ravichandran",
				"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
		
		List<Song> tempSongList= new ArrayList<Song>();
		tempSongList.add(testSong1);
		tempSongList.add(testSong2);
		tempSongList.add(testSong3);
		
		tempDB= new Database(tempSongList);
	}

	@After
	public void tearDown() {
		tempDB =null;
	}

	@Test
	public void testDatabase() {
		assertEquals("Results : ", true, tempDB.getSongList());
	}

	@Test
	public final void testSetSongList() {
		tempDB.setSongList(null);
		assertEquals("Results : ", true, tempDB.getSongList());
	}

	@Test
	public final void testIsEmpty() {
		assertFalse("Result : ", tempDB.isEmpty());
	}

	@Test
	public final void testAddSong() {
		testSong4 = new Song("Kadhal Cricket", "Kharesma Ravichandran",
				"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
		
		List<Song> tempSongList= new ArrayList<Song>();
		tempSongList.add(testSong4);
		
		
		testDB = new Database(tempSongList);
		
		assertEquals("Result : ", true, testDB.getSongList());
	}

	@Test
	public final void testRemoveSongSong() {
		testDB.removeSong(testSong1);
		assertEquals("Result : ", 3, testDB.getSongList().size());
	}

}
