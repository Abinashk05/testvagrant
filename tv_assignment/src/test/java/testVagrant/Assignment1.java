package testVagrant;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Assignment1 {
	
	public class RecentlyPlayedStore {
		private final int capacity;
		    private final Map<String, LinkedList<String>> userSongMap;
		   
		    public RecentlyPlayedStore(int capacity) {
		        this.capacity = capacity;
		        this.userSongMap = new HashMap<String, LinkedList<String>>();
		    }
		   
		    public void addSong(String user, String song) {
		        if (!userSongMap.containsKey(user)) {
		            userSongMap.put(user, new LinkedList<String>());
		        }
		       
		        LinkedList<String> songsList = userSongMap.get(user);
		       
		        // Check if the song is already in the list
		        if (songsList.contains(song)) {
		            songsList.remove(song);
		        } else if (songsList.size() >= capacity) {
		            // If the list is at capacity, remove the least recently played song
		            songsList.removeFirst();
		        }
		       
		        // Add the song to the end of the list
		        songsList.addLast(song);
		    }
		   
		    public LinkedList<String> getRecentlyPlayedSongs(String user) {
		        return userSongMap.get(user);
		    }

		}


}
