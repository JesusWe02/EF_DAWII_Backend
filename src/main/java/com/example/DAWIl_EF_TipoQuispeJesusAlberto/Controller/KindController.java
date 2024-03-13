package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Kind;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.KindService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/kind")
public class KindController {
	
	@Autowired 
	KindService service;

	@GetMapping
	public List<Kind> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
    public Kind findById(@PathVariable("id") int id) {
        return service.findById(id);
    }
	
}
