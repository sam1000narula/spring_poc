package mc.springboot.rest.example.springbootjpawithhibernateandh2.service;

import java.util.List;

import mc.springboot.rest.example.springbootjpawithhibernateandh2.model.Users;

public interface UserService {
	List<Users> getUsersList();
	Users insertUsers(Users users);
	void deleteUsers(Long id);
	Users updateUsers(Users users);
}
