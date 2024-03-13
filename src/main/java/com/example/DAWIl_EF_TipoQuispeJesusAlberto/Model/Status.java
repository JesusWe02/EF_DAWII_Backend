package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "status")
public class Status {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusId;
    private String name;
}
