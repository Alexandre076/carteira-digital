package com.ricardofellini.carteiradigital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ricardofellini.carteiradigital.domain.Infracoes;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class InfracoesDTO {

    private String placa;
    private String observacoes;
    private String local;
    private String veiculo;
    private BigDecimal valor;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    public Infracoes transformaObjeto(){
        return new Infracoes(placa, observacoes, local, veiculo, valor, data);
    }

}
