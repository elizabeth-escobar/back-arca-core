package com.arka.back_arka_core.mapper;

import com.arka.back_arka_core.domain.model.Cliente;
import com.arka.back_arka_core.request.ClientRequest;
import com.arka.back_arka_core.response.ClientResponse;

public class ClientMapper {

    // Cambiamos el nombre para que coincida con lo que pusiste en el controlador
    public static Cliente fromRequest(ClientRequest clientRequest){
        return Cliente.builder()
                .nombre(clientRequest.getNombre())
                .apellido(clientRequest.getApellido())
                .telefono(clientRequest.getTelefono())
                .activo(true)
                .build();
    }

    // Cambiamos el nombre para que coincida con el controlador
    public static ClientResponse fromDomain(Cliente cliente){
        return ClientResponse.builder()
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .build();
    }
}