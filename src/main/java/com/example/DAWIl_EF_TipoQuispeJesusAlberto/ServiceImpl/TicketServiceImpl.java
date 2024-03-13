package com.example.DAWIl_EF_TipoQuispeJesusAlberto.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Ticket;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository.TicketRepo;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	TicketRepo repo;

	@Override
	public List<Ticket> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Ticket> findByTitle(String title) {
		return repo.findByTitle(title);
	}

	@Override
	public Ticket findById(int id) {
		return repo.findById(id).orElseThrow();
	}

	@Override
	public Ticket save(Ticket ticket) {
		return repo.save(ticket);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
}
