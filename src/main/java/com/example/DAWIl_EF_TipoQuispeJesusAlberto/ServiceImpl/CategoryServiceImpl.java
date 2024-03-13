package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Category;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.CategoryRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepo repo;

	@Override
	public List<Category> findAll() {
		return repo.findAll();
	}

	@Override
	public Category findById(int id) {
		return repo.findById(id).orElseThrow();
	}
	
}
