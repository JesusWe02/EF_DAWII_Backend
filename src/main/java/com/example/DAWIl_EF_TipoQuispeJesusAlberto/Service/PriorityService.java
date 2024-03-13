package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Priority;

public interface PriorityService {
	List<Priority> findAll();
	Priority findById(int id);

}
