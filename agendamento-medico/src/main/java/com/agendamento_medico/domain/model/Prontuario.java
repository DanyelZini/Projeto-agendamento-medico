package com.agendamento_medico.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Classe que representa a entidade <strong>Prontuario</strong>.
 */
@Entity
public class Prontuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String historicoMedico;
    private String medicamento;
    private String alergias;

    // Constructors
    public Prontuario() {
    }
    public Prontuario(String historicoMedico, String medicamento, String alergias) {
        this.historicoMedico = historicoMedico;
        this.medicamento = medicamento;
        this.alergias = alergias;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getHistoricoMedico() {
        return historicoMedico;
    }
    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
    public String getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
}
