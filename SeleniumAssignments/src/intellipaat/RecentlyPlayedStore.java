package intellipaat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RecentlyPlayedStore {
		
	
		    
		    private final int capacity;
		    private final Map<String, Playlist> userToPlaylist;
		    
		    public RecentlyPlayedStore(int capacity) {
		        this.capacity = capacity;
		        this.userToPlaylist = new HashMap<>();
		    }
		    
		    public void recordPlay(String user, String song) {
		        Playlist playlist = userToPlaylist.computeIfAbsent(user, k -> new Playlist(capacity));
		    	playlist.addSong(song);
		    }
		    
		    public List<String> getRecentlyPlayedSongs(String user) {
		        Playlist playlist = userToPlaylist.get(user);
		        if (playlist == null) {
		            return Collections.emptyList();
		        }
		        return playlist.getRecentSongs();
		    }
		    
		    private static class Playlist {
		        
		        private final int capacity;
		        private final Deque<String> songs;
		        private final Map<String, Integer> songToTimestamp;
		        private int timestamp;
		        
		        public Playlist(int capacity) {
		            this.capacity = capacity;
		            this.songs = new LinkedList<>();
		            this.songToTimestamp = new HashMap<>();
		            this.timestamp = 0;
		        }
		        
		        public void addSong(String song) {
		            if (songs.size() == capacity) {
		                String oldestSong = songs.removeFirst();
		                songToTimestamp.remove(oldestSong);
		            }
		            songs.addLast(song);
		            songToTimestamp.put(song, timestamp++);
		        }
		        
		        public List<String> getRecentSongs() {
		            List<String> result = new ArrayList<>(songs);
		            result.sort(Comparator.comparingInt(songToTimestamp::get).reversed());
		            return result;
		        }
		        
		        public static void main(String[] args) {
			        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

			        store.recordPlay("user1", "S1");
			        store.recordPlay("user1", "S2");
			        store.recordPlay("user1", "S3");
			        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S3, S2, S1]

			        store.recordPlay("user1", "S4");
			        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S4, S2, S3]

			        store.recordPlay("user1", "S2");
			        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S2, S4, S3]

			        store.recordPlay("user1", "S1");
			        System.out.println(store.getRecentlyPlayedSongs("user1")); // output: [S1, S2, S4]
			    }
		        
		   }
		        
		}

		

       

