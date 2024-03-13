package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.UserRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo repo;

	@Override
	public List<User> findAll() {
		return repo.findAll();
	}

	@Override
	public List<User> findByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public User findById(int id) {
		return repo.findById(id).orElseThrow();
	}

	@Override
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
}
