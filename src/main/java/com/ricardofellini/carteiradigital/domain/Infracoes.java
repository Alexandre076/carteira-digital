package com.ricardofellini.carteiradigital.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Infracoes")
public class Infracoes {

    public Infracoes(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Placa")
    @NotEmpty
    @NotNull
    private String placa;

    @Column(name = "Valor")
    @NotNull
    private BigDecimal valor;

    @Column(name = "Observacoes")
    private String observacoes;

    @Column(name = "Local")
    @NotEmpty
    @NotNull
    private String local;

    @Column(name = "Veiculo")
    @NotEmpty
    @NotNull
    private String veiculo;

    @Column(name = "data")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    public Infracoes(String placa, String observacoes, String local, String veiculo, BigDecimal valor, LocalDate data) {
        this.placa = placa;
        this.valor = valor;
        this.observacoes = observacoes;
        this.local = local;
        this.veiculo = veiculo;
        this.data = data;
    }
}
