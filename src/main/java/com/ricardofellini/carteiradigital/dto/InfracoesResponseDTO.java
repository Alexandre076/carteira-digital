package com.ricardofellini.carteiradigital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ricardofellini.carteiradigital.domain.Infracoes;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class InfracoesResponseDTO {

    private String placa;
    private String observacoes;
    private String local;
    private String veiculo;
    private BigDecimal valor;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;

    public static InfracoesResponseDTO transformaEmDTO(Infracoes infracoes){
        return new InfracoesResponseDTO(infracoes.getPlaca(), infracoes.getObservacoes(), infracoes.getLocal(),
                infracoes.getVeiculo(), infracoes.getValor(), infracoes.getData());
    }
}
