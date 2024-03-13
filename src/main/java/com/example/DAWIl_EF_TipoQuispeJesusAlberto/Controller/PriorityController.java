package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Priority;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.PriorityService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/priority")
public class PriorityController {
	
	@Autowired
	PriorityService service;
	
	@GetMapping
	public List<Priority> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
    public Priority findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

}
