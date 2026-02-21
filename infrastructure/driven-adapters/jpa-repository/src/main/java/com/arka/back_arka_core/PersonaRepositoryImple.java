package com.arka.back_arka_core;
import com.arka.back_arka_core.entities.Usuario.Persona;
import com.arka.back_arka_core.entities.gateways.Usuario.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaRepositoryImple implements PersonaRepository{
    @Override
    public List<Persona> traerTodos() {
        return null;
    }

}
