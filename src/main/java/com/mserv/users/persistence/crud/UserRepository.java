package com.mserv.users.persistence.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mserv.users.persistence.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> getAll();
}
