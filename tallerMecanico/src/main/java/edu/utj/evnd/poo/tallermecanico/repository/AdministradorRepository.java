/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.evnd.poo.tallermecanico.repository;

import edu.utj.evnd.poo.tallermecanico.model.Administrador;
import java.util.ArrayList;

/**
 *
 * @author AlumnosCCD
 */
public class AdministradorRepository {
    private final ArrayList<Administrador>administradores;

    public AdministradorRepository() {
            administradores = new ArrayList<>();

    }
    
public void agregar (Administrador admin){
    
}
public ArrayList<Administrador> obtenerTodos(){
    return null;
    
}
public Administrador obtenerPorCurp(String curp){
    return null;
}
public boolean actualizar(Administrador admin, String curp){ 
        return false;
}
public boolean eliminar (String curp){
    return false;
}

}