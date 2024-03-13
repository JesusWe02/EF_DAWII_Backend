package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Kind;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.KindRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.KindService;

@Service
public class KindServiceImpl implements KindService{
	@Autowired
	KindRepo repo;
	
	@Override
	public List<Kind> findAll() {
		return repo.findAll();
	}

	@Override
	public Kind findById(int id) {
		return repo.findById(id).orElseThrow();
	}
}
