package com.arka.back_arka_core.mappers;

import com.arka.back_arka_core.entities.Cliente;
import com.arka.back_arka_core.request.ClientRequest;
import com.arka.back_arka_core.response.ClientResponse;

public class ClientMapper {
    public static Cliente fromRequest(ClientRequest clientRequest){
        return Cliente.builder()
                .nombre(clientRequest.getNombre())
                .apellido(clientRequest.getApellido())
                .telefono(clientRequest.getTelefono())
                .activo(true)
                .build();
    }

    public static ClientResponse fromResponse(Cliente cliente){
        return ClientResponse.builder()
                .nombre(cliente.getNombre())
                .apellido(cliente.getApellido())
                .build();
    }
}
