package com.arka.back_arka_core.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class ClientRequest {
    private String nombre;
    private String apellido;
    private String telefono;

}
