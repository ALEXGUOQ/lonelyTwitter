package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.List;

public abstract class User implements UserLike {
	protected String username;
	private List<Friend> friends;

	public User(String username, List<Friend> friends) {
		super();
		this.username = username;
		this.friends = friends;
	}
	
	public User() {
		super();
		this.username = "anonymous";
	}

	public String getUsername() {
		return username;
	}

	public abstract void setUsername(String username) throws IOException;
	
	public List<Friend> getFriends() {
		return friends;
	}
}
