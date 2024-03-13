package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.UserService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @GetMapping(params = "name")
    public List<User> findByName(@RequestParam("name") String name) {
        return service.findByName(name);
    }

    @PostMapping
    public User save(@RequestBody User user) {
    	System.out.println("Datos recibidos en el método save del UserController:");
    	System.out.println(user.toString()); 
        return service.save(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable("id") int id, @RequestBody User user) {
    	user.setUserId(id);
    	System.out.println("Datos recibidos en el método update del UserController:");
        System.out.println(user.toString()); // Imprime los datos recibidos
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }
	
}
