package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Priority;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.PriorityRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService{
	@Autowired
	PriorityRepo repo;

	@Override
	public List<Priority> findAll() {
		return repo.findAll();
	}

	@Override
	public Priority findById(int id) {
		return repo.findById(id).orElseThrow();
	}
}
