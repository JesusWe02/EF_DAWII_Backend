package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Category;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.CategoryService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired 
	private CategoryService service;
	
	@GetMapping
	public List<Category> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
    public Category findById(@PathVariable("id") int id) {
        return service.findById(id);
    }
	
}
