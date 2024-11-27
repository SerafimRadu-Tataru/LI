package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Titlul este obligatoriu") //Valideaza prezenta valorii
    @Size(max = 100, message = "Titlul nu poate depăși 100 de caractere") //Valideaza lungimea textului
    private String title;

    @NotBlank(message = "Autorul este obligatoriu")  //Valideaza prezenta valorii
    @Size(max = 50, message = "Numele autorului nu poate depăși 50 de caractere")  //Valideaza lungimea textului
    private String author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

}
