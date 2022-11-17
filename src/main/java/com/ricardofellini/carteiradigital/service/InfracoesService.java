package com.ricardofellini.carteiradigital.service;


import com.ricardofellini.carteiradigital.domain.Infracoes;
import com.ricardofellini.carteiradigital.repository.InfracoesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfracoesService {

    private final InfracoesRepository infracoesRepository;

    public List<Infracoes> findByPlaca(String placa){
        return infracoesRepository.findByPlaca(placa);
    }

    public List<Infracoes> findAll(){
        return infracoesRepository.findAll();
    }

    public Infracoes salvaInfracoes(Infracoes infracoes){
        return infracoesRepository.save(infracoes);
    }
}
