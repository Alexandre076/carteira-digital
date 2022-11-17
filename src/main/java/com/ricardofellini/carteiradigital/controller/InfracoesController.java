package com.ricardofellini.carteiradigital.controller;


import com.ricardofellini.carteiradigital.domain.Infracoes;
import com.ricardofellini.carteiradigital.dto.InfracoesDTO;
import com.ricardofellini.carteiradigital.dto.InfracoesResponseDTO;
import com.ricardofellini.carteiradigital.service.InfracoesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/infracoes/")
public class InfracoesController {

    private final InfracoesService infracoesService;

    public InfracoesController(InfracoesService infracoesService) {
        this.infracoesService = infracoesService;
    }
    @CrossOrigin
    @GetMapping
        public ResponseEntity<List<Infracoes>> listaTodas(){
        return new ResponseEntity<>(infracoesService.findAll(), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping(path = "/find")
    public ResponseEntity<List<Infracoes>> listaByPlaca(@RequestParam String placa){
        return new ResponseEntity<>(infracoesService.findByPlaca(placa), HttpStatus.OK);
    }
    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<InfracoesResponseDTO> salvaInfracao(@RequestBody @Valid InfracoesDTO infracoesDTO){
        Infracoes infracoes = infracoesService.salvaInfracoes(infracoesDTO.transformaObjeto());
        return new ResponseEntity<>(InfracoesResponseDTO.transformaEmDTO(infracoes), HttpStatus.CREATED);
    }

}
