package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Kind;

@Repository
public interface KindRepo extends JpaRepository<Kind, Integer> {

}
