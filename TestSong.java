package jukeboxpkg;

import jukeboxpkg.Song;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestSong {

	private Song testSong1, testSong2, testSong3;
	
	@Before
    public void setUp() {
        testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 214);
        testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
               "Thani Oruvan", "Cricket.mp3", "Mp3", 50);
        testSong3 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
                "Thani Oruvan", "Cricket.mp3", "Mp3", 23);
    }

    @After
    public void tearDown() {
        testSong1 = null;
        testSong2 = null;
        testSong3 = null;
        
    }
    
	@Test
	public void testSong() {
		//fail("Not yet implemented");
		assertEquals("Kadhal Cricket", testSong1.getName());
		assertEquals("Kharesma Ravichandran", testSong1.getArtist());
		assertEquals("Thani Oruvan", testSong1.getAlbum());
		assertEquals("Cricket.mp3",testSong1.getName());
		assertEquals("Mp3",testSong1.getFormat());
		assertEquals(214, testSong1.getDuration());
	}

	@Test
	public void testGetName() {
		assertEquals("Cricket.mp3",testSong1.getName());
	}

	@Test
	public void testSetName() {
		testSong2.setName("Kadhal Cricket");
        assertEquals("Result", true, testSong2.getName());
	}

	@Test
	public void testGetArtist() {
		assertEquals("Kharesma Ravichandran", testSong1.getArtist());
	}

	@Test
	public void testSetArtist() {
		testSong2.setArtist("Kharesma Ravichandran");		
		assertEquals("Kharesma Ravichandran","Kharesma Ravichandran", testSong1.getArtist());
	}

	@Test
	public void testGetAlbum() {
		assertEquals("Result","Thani Oruvan",testSong2.getAlbum());
	}

	@Test
	public void testSetAlbum() {
		testSong2.setAlbum("Thani Oruvan");;
        assertEquals("Result", true, testSong2.getAlbum());
	}

	@Test
	public void testGetUrl() {
		testSong2.getUrl();
		assertEquals("Result",true, testSong2.getUrl());
	}

	@Test
	public void testSetUrl() {
		testSong2.setUrl("www.google.com");
		assertEquals("Result",true, testSong2.getUrl());
	}

	@Test
	public void testGetFormat() {
		testSong2.getFormat();
		assertEquals("Result", true, testSong2.getFormat());
	}

	@Test
	public void testSetFormat() {
		testSong2.setFormat("jpg");
		assertEquals("Result",true, testSong2.getFormat());
	}

	@Test
	public void testGetDuration() {
		testSong2.getDuration();
        assertEquals("Result", 25, testSong2.getDuration(), 0);
	}

	@Test
	public void testSetDuration() {
		testSong2.setDuration(214);
        assertEquals("Result", 214, testSong2.getDuration(), 0);		
	}

	@Test
	public void testIsLong_GreaterThan50() {
//		 assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
		 assertTrue(testSong1.isLong());
	}
	
	@Test
	public void testIsLong_Equals50() {
//		 assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
		 assertFalse(testSong2.isLong());
	}
	
	@Test
	public void testIsLong_LessThan50() {
//		 assertEquals("Song is long if length is more than 50",true,testSong1.isLong());
		assertFalse(testSong3.isLong());
	}

}
