package com.arka.back_arka_core.response;


import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public record ClientResponse{

    private String nombre;
    private String apellido;

}

