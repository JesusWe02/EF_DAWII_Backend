package com.example.DAWIl_EF_TipoQuispeJesusAlberto.Model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "ticket")
public class Ticket {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    private String title;
    private String description;
    private LocalDate updated_at;
    private LocalDate created_at;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kindId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Kind kind;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projectId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Project project;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category category;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "priorityId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Priority priority;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId" )
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Status status;
    
    
}
