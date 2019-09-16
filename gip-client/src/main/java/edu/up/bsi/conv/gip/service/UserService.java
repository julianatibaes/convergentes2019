package edu.up.bsi.conv.gip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.up.bsi.conv.gip.model.User;

@Service
public class UserService {

	private List<User> allUsers = new ArrayList<>();
	public List<User> getAllUserArticles(){
		return allUsers;
	}
	public void addUser(User user) {
		allUsers.add(user);
	}
}
