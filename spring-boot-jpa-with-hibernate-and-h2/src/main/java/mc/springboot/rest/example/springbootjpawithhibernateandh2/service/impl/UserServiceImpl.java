package mc.springboot.rest.example.springbootjpawithhibernateandh2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.springboot.rest.example.springbootjpawithhibernateandh2.model.Users;
import mc.springboot.rest.example.springbootjpawithhibernateandh2.repository.UserReppository;
import mc.springboot.rest.example.springbootjpawithhibernateandh2.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserReppository userReppository;

	@Override
	public List<Users> getUsersList() {
		return userReppository.findAll();
	}

	@Override
	public Users insertUsers(Users users) {
		return userReppository.save(users);
	}

	@Override
	public void deleteUsers(Long id) {
		userReppository.delete(id);
	}

	@Override
	public Users updateUsers(Users users) {
		return userReppository.saveAndFlush(users);
	}

}
