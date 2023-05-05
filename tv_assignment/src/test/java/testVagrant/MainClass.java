package testVagrant;

import java.util.LinkedList;

import org.testng.annotations.Test;

import testVagrant.Assignment1.RecentlyPlayedStore;


public class MainClass {
	
	Assignment1 assignment = new Assignment1();
 
		@Test
		public void addSongs() {
		RecentlyPlayedStore store =assignment.new RecentlyPlayedStore(3);
//		   store.addSong("John", "S1");
//		   store.addSong("John", "S2");
//		   store.addSong("John", "S3");
//		   store.addSong("John", "S4");
//		   store.addSong("John", "S2");
//		   store.addSong("John", "S1");
//		   store.addSong("John", "S5");
//		   
//		   LinkedList<String> johnsSongs = store.getRecentlyPlayedSongs("John");
//		   System.out.println(johnsSongs);
//
//		}
		
		store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S3, S2, S1]

        store.addSong("user1", "S4");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S4, S2, S3]

        store.addSong("user1", "S2");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S2, S4, S3]

        store.addSong("user1", "S1");
        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S1, S2, S4]
    }
	}


