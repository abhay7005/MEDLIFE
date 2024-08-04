package com.medlife.api.service;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.transaction.annotation.Transactional;

import com.medlife.api.entity.Role;
import com.medlife.api.entity.User;
import com.medlife.api.security.CustomUserDetail;
/**
 * @author Abhay
 *
 */
@Transactional
public interface UserService {
	CustomUserDetail loadUserByUserId(String userId);

	boolean addUser(User user);

	User loginUser(User user);

	boolean deleteUserById(String id);

	User getUserById(String id);

	List<User> getAllUsers();

	User updateUser(User user);

	Long getUsersTotalCounts();

	Long getUsersTotalCounts(String type);

	Long getUserCountByDateAndType(Date registeredDate, String type);

	List<User> getUserByFirstName(String firstName);

	Role addRole(Role role);

	public Role getRoleById(int roleId);
	
	
	public String generateReport();
	
	public String sample();


	

}
