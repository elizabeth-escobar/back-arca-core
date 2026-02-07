package com.arka.back_arka_core.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Cliente extends Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean activo;
}
