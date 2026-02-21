package com.arka.back_arka_core.controller;

import com.arka.back_arka_core.domain.port.in.ClientUseCase;
import com.arka.back_arka_core.entities.Cliente;
import com.arka.back_arka_core.mapper.ClientMapper;
import com.arka.back_arka_core.request.ClientRequest;
import com.arka.back_arka_core.response.ClientResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
@RequiredArgsConstructor // Esto inyectará el campo 'final' automáticamente
public class ClientController {

    // 1. Quitamos el static y agregamos final
    private final ClientUseCase clientUseCase;

    @PostMapping("/create")
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest) {
        // Mapeo de Request a Dominio
        Cliente clienteToDomain = ClientMapper.fromRequest(clientRequest);

        // Ejecución de la lógica de negocio
        Cliente clienteToResponse = clientUseCase.execute(clienteToDomain);

        // Mapeo de Dominio a Response
        ClientResponse clientResponse = ClientMapper.fromDomain(clienteToResponse);

        // 2. Corregimos el retorno del ResponseEntity
        return ResponseEntity.ok(clientResponse);
    }
}