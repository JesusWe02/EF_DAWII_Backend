package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Project;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.ProjectService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	ProjectService service;
	
	@GetMapping
	public List<Project> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
    public Project findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

}
