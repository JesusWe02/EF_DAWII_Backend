package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.name LIKE %?1%")
    List<User> findByName(String name);
	
	Optional<User> findByUsername(String username);
}
