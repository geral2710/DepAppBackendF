package com.example.ApiG25.Modelos;

import org.springframework.data.annotation.Id;

public class EquipoModelo {
    
    @Id
    private Long codigo;
    private String nombre;
    private String ciudad;
    private String fundacion;
    private String propietario;
    private String presidente;
    private String entrenador;
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getFundacion() {
        return fundacion;
    }
    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public String getPresidente() {
        return presidente;
    }
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getEntrenador() {
        return entrenador;
    }
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    
    
    

    
}
