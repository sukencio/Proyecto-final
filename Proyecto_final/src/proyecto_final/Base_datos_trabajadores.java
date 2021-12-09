/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JOptionPane;
public class Base_datos_trabajadores 
{
   private String Nombre; 
   private String password; 
    
    public Base_datos_trabajadores(){
        
    }
    
    public Base_datos_trabajadores(String Nombre)
    {
        this(Nombre,"");
    }
    public Base_datos_trabajadores(String Nombre, String password)
    {
       this.Nombre=Nombre;
    }
    
    
    /*
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getpassword() {
        return password;
    }

    public void setpassword(int password) {
        this.password = password;
    }
    */

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String toString()
    {
        return "Bienvenido "+Nombre+" Iniciando proceso de carga";       
    }
    
    public void mensaje()
    {
        JOptionPane.showMessageDialog(null, "Biblioteca Gotham, Trabajador "+Nombre);
    }
    
    
    
    
}

