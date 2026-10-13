/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.evnd.poo.tallermecanico.model;

import edu.utj.evnd.poo.tallermecanico.enums.EstadoAdministrador;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author AlumnosCCD
 */
public final class Administrador extends Persona {

    private String urlImagen;
    private String usuario;
    private String contrasena;
    private EstadoAdministrador estado;
    private String rol;

    /**
     * Constructor por defecto sin parámetros. Inicializa el estado en ACTIVO por defecto.
     */
    public Administrador() {
        super();
        this.estado = EstadoAdministrador.ACTIVO;
    }

    /**
     * Constructor completo con los atributos mínimos e indispensables.
     *
     * @param id Identificador primario de la persona.
     * @param curp CURP de la persona.
     * @param rfc RFC de la persona.
     * @param nombre Nombre(s) de la persona.
     * @param apellido Apellido(s) de la persona.
     * @param nacimiento Fecha de nacimiento.
     * @param correo Correo electrónico.
     * @param telefono Número de teléfono.
     * @param urlImagen Ruta o URL de la fotografía del administrador.
     * @param usuario Nombre de usuario en el sistema.
     * @param contrasena Contraseña de acceso.
     * @param estado Estado operativo (ACTIVO, INACTIVO, etc.).
     * @param rol Rol asignado dentro de la aplicación.
     */
    public Administrador(int id, String curp, String rfc, String nombre, String apellido,
        LocalDate nacimiento, String correo, String telefono,
        String urlImagen, String usuario, String contrasena,
        EstadoAdministrador estado, String rol) {
    // Pasar los campos base a la clase Persona
    super(id, curp, rfc, nombre, apellido, null, correo, telefono, urlImagen);
    this.urlImagen = urlImagen;
    this.usuario = usuario;
    this.contrasena = contrasena;
    this.estado = estado;
    this.rol = rol;
}

    // --- GETTERS Y SETTERS ---
    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public EstadoAdministrador getEstado() {
        return estado;
    }

    public void setEstado(EstadoAdministrador estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Devuelve la representación en texto del Administrador concatenando los
     * datos base recibidos de super.toString().
     *
     * @return Cadena formateada con la información completa del objeto.
     */
    @Override
    public String toString() {
        return "Administrador{" + super.toString()
                + ", urlImagen='" + urlImagen + '\''
                + ", usuario='" + usuario + '\''
                + ", estado=" + estado
                + ", rol='" + rol + '\'' + '}';
    }
}
