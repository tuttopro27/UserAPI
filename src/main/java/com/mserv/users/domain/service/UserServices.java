package com.mserv.users.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mserv.users.persistence.crud.UserRepository;
import com.mserv.users.persistence.entity.User;

@Service
public class UserServices {

@Autowired
private UserRepository userRepository;

public User userSave(User user)
{
	return userRepository.save(user);
}
public List<User> getAll()
{
	return userRepository.getAll();
}
}
