package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Service;

import java.util.List;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Ticket;

public interface TicketService {
	List<Ticket> findAll();
	List<Ticket> findByTitle(String title);
	Ticket findById(int id);
	Ticket save(Ticket ticket);
	void deleteById(int id);
}
