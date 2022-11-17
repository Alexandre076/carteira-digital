package com.ricardofellini.carteiradigital.repository;

import com.ricardofellini.carteiradigital.domain.Infracoes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InfracoesRepository extends JpaRepository<Infracoes, Long> {

    List<Infracoes> findByPlaca(String placa);

}
