package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Category;

public interface CategoryService {
	
	List<Category> findAll();
	Category findById(int id);
	
}
