/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JOptionPane;
public class Devolucion 
{
    String Usuario;
    String Nombre_libro;
    
    public void ingresar_datos()
    {
        Usuario = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        Nombre_libro = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro: ");
        
        JOptionPane.showMessageDialog(null, "Libro devuelto, Muchas Gracias "+Usuario);
        
    }
    
}
