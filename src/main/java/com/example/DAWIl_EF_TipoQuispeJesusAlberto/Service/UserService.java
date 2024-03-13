package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;

public interface UserService {
	
	List <User> findAll();
	List <User> findByName(String name);
	User findById(int id);
	User save(User user);
	void deleteById(int id);
}
