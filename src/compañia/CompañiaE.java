/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañia;

import java.util.Scanner;
import tareaempleados.Empleados;

/**
 *
 * @author loper
 */
public class CompañiaE {

   
    
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
    int opcion;
        Empleados empleado1 = new Empleados("Gabriela","Peralta","Calle 56",655240);
        Empleados empleado2 = new Empleados("Ivan","Prada","Calle 66",658850);
        Empleados empleado3 = new Empleados("Maria","Castellanos","Calle 5",665449);
        Empleados empleado4 = new Empleados("Jorge","Lopeza","Calle 15",6657850);
        Empleados empleado5 = new Empleados("Michelle","Arias","Calle 65",658547);
        
        System.out.println("Menu por consola");
        System.out.println("1.- Si desea conocer los datos del empleado 1");
        System.out.println("2.- Si desea conocer los datos del empleado 2");
        System.out.println("3.- Si desea conocer los datos del empleado 3");
        System.out.println("4.- Si desea conocer los datos del empleado 4");
        System.out.println("5.- Si desea conocer los datos del empleado 5");
        System.out.println("Ingrese el numero de la accion a realizar: "); 
        opcion = reader.nextInt();
       
        switch(opcion) {

            case 1:
               System.out.println("Nombre: "+empleado1.getNombre()+ " Apellido: "+empleado1.getApellido()+" Direccion: "+empleado1.getDireccion()+" Celular: "+empleado1.getCelular());
                break;

            case 2:
               System.out.println("Nombre: "+empleado2.getNombre()+ " Apellido: "+empleado2.getApellido()+" Direccion: "+empleado2.getDireccion()+" Celular: "+empleado2.getCelular());
                break;

            case 3:
                System.out.println("Nombre: "+empleado3.getNombre()+ " Apellido: "+empleado3.getApellido()+" Direccion: "+empleado3.getDireccion()+" Celular: "+empleado3.getCelular());
                break;

            case 4:
                System.out.println("Nombre: "+empleado4.getNombre()+ " Apellido: "+empleado4.getApellido()+" Direccion: "+empleado4.getDireccion()+" Celular: "+empleado4.getCelular());
                break;
                
            case 5:
                System.out.println("Nombre: "+empleado5.getNombre()+ " Apellido: "+empleado5.getApellido()+" Direccion: "+empleado5.getDireccion()+" Celular: "+empleado5.getCelular());
                break;
        }
            
      
    }       
      
   
    
    }

