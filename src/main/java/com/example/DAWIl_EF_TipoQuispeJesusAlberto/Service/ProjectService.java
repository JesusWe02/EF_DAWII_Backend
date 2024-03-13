package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Project;

public interface ProjectService {
	List<Project> findAll();
	Project findById(int id);
}
