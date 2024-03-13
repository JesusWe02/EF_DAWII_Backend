package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Status;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.StatusService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/status")
public class StatusController {

	@Autowired
	StatusService service;
	
	@GetMapping
	public List<Status> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
    public Status findById(@PathVariable("id") int id) {
        return service.findById(id);
    }
}
