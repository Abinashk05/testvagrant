package intellipaat;

public class Implementation extends RecentltyPlayedStore {

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
