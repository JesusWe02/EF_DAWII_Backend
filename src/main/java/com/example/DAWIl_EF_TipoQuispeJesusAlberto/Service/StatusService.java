package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Status;

public interface StatusService {
	List<Status> findAll();
	Status findById(int id);
}
