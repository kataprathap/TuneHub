package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Song;

public interface SongService {
	
	public void addSong(Song song);

	//public List<Song> fetchAllSongs(Song song);

	public boolean songExists(String name);

	public List<Song> fetchAllSongs();
	
	public void updateSong(Song song);
	
	

}
