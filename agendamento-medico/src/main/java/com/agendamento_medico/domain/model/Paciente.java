package com.agendamento_medico.domain.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 * Classe que representa a entidade <strong>Paciente</strong>.
 * 
 * @see Prontuario
 */
@Entity
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private Date dataNascimento;

    @OneToOne(cascade = CascadeType.ALL)
    private Prontuario prontuario;
    
    // Constructors
    public Paciente() {
    }
    public Paciente(String nome, String telefone, String email, Date dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

}
