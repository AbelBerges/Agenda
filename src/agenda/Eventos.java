/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author kalema
 */
public class Eventos {
    private String nombre;
    private String estado;
    private Date  fecha;
    private Categorias lasCategorias;
    
    public Eventos(String nombre, String estado, Date fecha, Categorias lasCategorias){
        this.nombre=nombre;
        this.estado=estado;
        this.fecha=fecha;
        this.lasCategorias=lasCategorias;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    
    public Categorias getLasCategorias(){
        return lasCategorias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setLasCategorias(Categorias lasCategorias){
        this.lasCategorias=lasCategorias;
    }
    
}
