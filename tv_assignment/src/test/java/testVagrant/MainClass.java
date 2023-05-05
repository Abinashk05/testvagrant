package testVagrant;

import java.util.LinkedList;

import org.testng.annotations.Test;

import testVagrant.Assignment1.RecentlyPlayedStore;


public class MainClass {
	
	Assignment1 assignment = new Assignment1();
 
		@Test
		public void addSongs() {
		RecentlyPlayedStore store =assignment.new RecentlyPlayedStore(3);
		   store.addSong("John", "S1");
		   store.addSong("John", "S2");
		   store.addSong("John", "S3");
		   store.addSong("John", "S4");
		   store.addSong("John", "S2");
		   store.addSong("John", "S1");
		   store.addSong("John", "S5");
		   
		   LinkedList<String> johnsSongs = store.getRecentlyPlayedSongs("John");
		   System.out.println(johnsSongs);

		}
	}


