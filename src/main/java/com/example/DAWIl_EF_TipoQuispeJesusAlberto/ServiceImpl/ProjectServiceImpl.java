package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Project;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.ProjectRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	ProjectRepo repo;

	@Override
	public List<Project> findAll() {
		return repo.findAll();
	}

	@Override
	public Project findById(int id) {
		return repo.findById(id).orElseThrow();
	}
}
