package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
