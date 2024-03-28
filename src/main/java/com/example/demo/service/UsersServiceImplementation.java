package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Song;
import com.example.demo.entities.Users;
import com.example.demo.repositories.UsersRepository;

@Service
public class UsersServiceImplementation implements UsersService{
	@Autowired
	UsersRepository repo;
	
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "user added Successfilly";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}
		else {
		return false;
	}

}

	@Override
	public boolean validateUser(String email, String password) {
		Users user =repo.findByEmail(email);
		String db_pass = user.getPassword();
		if(password.equals(db_pass)) {
			return true;
		}
		return false;
	}

	@Override
	public String getRole(String email) {
		Users user = repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public boolean songExists(String name) {
		Song song = repo.findByName(name);
		if(song == null) {
			return false;
		}
		else {
		return true;
	}
}

	@Override
	public Users getUser(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public void updateUser(Users user) {
		repo.save(user);
	}
}

	