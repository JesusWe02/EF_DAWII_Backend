package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer>{
	@Query("SELECT t FROM Ticket t WHERE t.title LIKE %?1%")
    List<Ticket> findByTitle(String title);
}
