package com.medlife.api.serviceimpl;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.medlife.api.dao.UserDao;
import com.medlife.api.entity.Role;
import com.medlife.api.entity.User;
import com.medlife.api.exception.ResourceNotFoundException;
import com.medlife.api.security.CustomUserDetail;
import com.medlife.api.service.UserService;
/**
 * @author Abhay
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserDao dao;

	@Override
	public boolean addUser(User user) {
		boolean user2 = dao.addUser(user);
		return user2;

	}

	@Override
	public User loginUser(User user) {

		return dao.loginUser(user);
	}

	@Override
	public CustomUserDetail loadUserByUserId(String userId) {
		return dao.loadUserByUserId(userId);
	}

	@Override
	public boolean deleteUserById(String id) {
		return false;
		
	}

	@Override
	public User getUserById(String id) {
		return null;
		
	}

	@Override
	public List<User> getAllUsers() {
		
		List<User> allUsers=dao.getAllUsers();
		
		if(allUsers.isEmpty())
		{
			throw new ResourceNotFoundException("Users Not found.");
		}

		return allUsers;
	}

	@Override
	public User updateUser(User user) {
		return null;

	}

	@Override
	public Long getUsersTotalCounts() {
		return null;
		
	}

	@Override
	public Long getUsersTotalCounts(String type) {
		return null;
		
	}

	@Override
	public Long getUserCountByDateAndType(Date registereddate, String type) {
		return null;
		
	}

	@Override
	public List<User> getUserByFirstName(String firstName) {
		return null;
		
	}

	@Override
	public Role addRole(Role role) {

		return null;

	}

	@Override
	public Role getRoleById(int roleId) {
		return dao.getRoleById(roleId);
		

		
	}

	@Override
	public String generateReport() {
		return null;
		
	}

	@Override
	public String sample() {
		
		return "hi";
	}

}
