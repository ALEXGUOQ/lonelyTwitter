package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User implements UserLike {
	protected String username;

	public User(String username) {
		super();
		this.username = username;
	}
	
	public User() {
		super();
		this.username = "anonymous";
	}

	public String getUsername() {
		return username;
	}

	public abstract void setUsername(String username) throws IOException;
}
