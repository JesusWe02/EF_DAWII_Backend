package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Status;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.StatusRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{
	@Autowired
	StatusRepo repo;

	@Override
	public List<Status> findAll() {
		return repo.findAll();
	}

	@Override
	public Status findById(int id) {
		return repo.findById(id).orElseThrow();
	}
}
