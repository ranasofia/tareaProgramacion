/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaempleados;

/**
 *
 * @author loper
 */
public class Empleados {

    private String nombre;
    private String apellido;
    private String direccion;
    private int celular;
    
   public Empleados(){
//CONSTRUCTOR SOBRECARGADO
} 
   public Empleados (String nombre, String apellido , String direccion , int celular){
       this.nombre=nombre;
       this.apellido=apellido;
       this.direccion=direccion;
       this.celular=celular;
   } 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }
   
}



        
