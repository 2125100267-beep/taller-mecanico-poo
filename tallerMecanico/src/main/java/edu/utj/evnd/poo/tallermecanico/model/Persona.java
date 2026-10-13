/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.utj.evnd.poo.tallermecanico.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Francisco Alejandro Ramirez Garcia
 */
public abstract class Persona {
    private int id;
    private String curp;
    private String rfc;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String correo;
    private String telefono;
    private String urlImagen;

    public Persona() {
        
        curp = "";
        nacimiento = new Date();
    }

    public Persona(int id, String curp, String rfc, String nombre, String apellido, Date nacimiento, String correo, String telefono, String urlImagen) {
        this.id = id;
        this.curp = curp;
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.urlImagen = urlImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.curp);
        hash = 11 * hash + Objects.hashCode(this.rfc);
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.apellido);
        hash = 11 * hash + Objects.hashCode(this.nacimiento);
        hash = 11 * hash + Objects.hashCode(this.correo);
        hash = 11 * hash + Objects.hashCode(this.telefono);
        hash = 11 * hash + Objects.hashCode(this.urlImagen);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.curp, other.curp)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.urlImagen, other.urlImagen)) {
            return false;
        }
        return Objects.equals(this.nacimiento, other.nacimiento);
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", curp=" + curp + ", rfc=" + rfc + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", correo=" + correo + ", telefono=" + telefono + ", urlImagen=" + urlImagen + '}';
    }
}
  
