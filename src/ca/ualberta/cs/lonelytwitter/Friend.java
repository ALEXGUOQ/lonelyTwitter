package ca.ualberta.cs.lonelytwitter;

import java.util.List;

public class Friend {
	private String name;
	private String username;
	private List<String> publicUpdates;
	
	public Friend(String name, String username, List<String> publicUpdates) {
		this.name = name;
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public List<String> getPublicUpdates() {
		return publicUpdates;
	}
}
