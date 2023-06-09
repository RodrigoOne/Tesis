package com.example.ProyectoBoot.InterServices;

import com.example.ProyectoBoot.Entidad.Paciente;
import com.example.ProyectoBoot.Entidad.Secretaria;

import java.util.List;
import java.util.Optional;

public interface InterSecretariaSer {

    public List<Secretaria> listar();
    public Optional<Secretaria> listarId(String rut);
    public String save(Secretaria s);
    public  void delete(String s);
}
