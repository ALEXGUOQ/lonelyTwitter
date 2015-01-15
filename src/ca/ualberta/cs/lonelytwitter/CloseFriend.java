package ca.ualberta.cs.lonelytwitter;

import java.util.List;

public class CloseFriend extends Friend {
	private List<String> privateUpdates;
	
	public CloseFriend(String name, String username, List<String> publicUpdates, List<String> privateUpdates) {
		super(name, username, publicUpdates);
		this.privateUpdates = privateUpdates;
	}
	
	public List<String> getPrivateUpdates() {
		return privateUpdates;
	}
}
