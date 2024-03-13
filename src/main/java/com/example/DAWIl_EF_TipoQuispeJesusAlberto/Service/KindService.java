package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Kind;

public interface KindService {
	List<Kind> findAll();
	Kind findById(int id);
}
