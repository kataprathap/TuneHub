package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Song;
import com.example.demo.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	public Users findByEmail(String email);

	public Song findByName(String name);

	//public Song findByName(String name);



}
