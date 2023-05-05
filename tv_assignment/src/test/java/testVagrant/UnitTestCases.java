package testVagrant;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import java.util.LinkedList;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testVagrant.Assignment1.RecentlyPlayedStore;

public class UnitTestCases {
	
	Assignment1 assignment = new Assignment1();

	
	private RecentlyPlayedStore store;

	@BeforeTest
	void setUp() throws Exception {
	    store = assignment.new RecentlyPlayedStore(3);
	}

	@Test
	void testAddSong() {
	    store.addSong("John", "S1");
	    store.addSong("John", "S2");
	    store.addSong("John", "S3");
	    store.addSong("John", "S4");
	    store.addSong("John", "S2");
	    store.addSong("John", "S1");
	    store.addSong("John", "S5");
	   
	    LinkedList<String> johnsSongs = store.getRecentlyPlayedSongs("John");
	    assertEquals(3, johnsSongs.size());
	    assertEquals("S4", johnsSongs.get(0));
	    assertEquals("S2", johnsSongs.get(1));
	    assertEquals("S1", johnsSongs.get(2));
	}

	@Test
	void testGetRecentlyPlayedSongs() {
	    store.addSong("John", "S1");
	    store.addSong("John", "S2");
	    store.addSong("John", "S3");
	   
	    LinkedList<String> johnsSongs = store.getRecentlyPlayedSongs("John");
	    assertEquals(3, johnsSongs.size());
	    assertEquals("S1", johnsSongs.get(0));
	    assertEquals("S2", johnsSongs.get(1));
	    assertEquals("S3", johnsSongs.get(2));
	   
	    LinkedList<String> janesSongs = store.getRecentlyPlayedSongs("Jane");
	    assertNull(janesSongs);
	}

	}



