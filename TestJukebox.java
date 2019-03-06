package jukeboxpkg;

import jukeboxpkg.Database;
import jukeboxpkg.Jukebox;
import jukeboxpkg.Song;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestJukebox {
	
	private Jukebox testJuke;
	Database tempDB;
	
	@Before
	public void setUp() {
		Song testSong1 =new Song("Kadhal Cricket", "Kharesma Ravichandran", 
				"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		Song testSong2 =new Song("Kannala Kannala", "Kaushik Krish", 
				"Thani Oruvan", "Kannala.mp3", "Mp3", 215);
		Song testSong3 =new Song("Kadhal Cricket", "Kharesma Ravichandran",
				"Thani Oruvan", "D://Cricket.mp3", "Mp3", 214);
		
		List<Song> tempSongList= new ArrayList<Song>();
		tempSongList.add(testSong1);
		tempSongList.add(testSong2);
		tempSongList.add(testSong3);

		Database tempDB= new Database(tempSongList);
		
		testJuke = new Jukebox(tempDB, -123);
	}

	@Test
	public void testJukebox() {
		assertEquals("Results : ", 121212, testJuke.isValidCreditCard());
	}

	@Test
	public void testJukeboxDatabaseInt() {
		//assertEquals("Results : ", testJuke.);
	}

	@Test
	public final void testGetDb() {
		assertEquals("Results : ", true, testJuke.getDb());
	}

	@Test
	public final void testSetDb() {
		testJuke.setDb(null); 
		assertEquals("Results : ", true, testJuke.getDb());
	}

	@Test
	public final void testGetCreditCard() {
		assertEquals("Results : ", true, testJuke.getCreditCard());  
	}

	@Test
	public final void testSetCreditCard() {
		testJuke.setCreditCard(1234);
		assertEquals("Results : ", true, testJuke.getCreditCard()); 
	}


	@Test
	public final void testIsValidCreditCard() {
		assertFalse("Result : ", testJuke.isValidCreditCard());
	}

}
