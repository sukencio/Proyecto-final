/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JOptionPane;
public class Carnet 
{
   public  String  nombre, apellidos, cedula,correo;
   public int  telf; 
   
   public void RegistroCarnet()
    {
        JOptionPane.showMessageDialog(null ,">>Ingrese los datos que se le solicitan<<");
    
          nombre= JOptionPane.showInputDialog(" Digite su nombre: ");
         apellidos = JOptionPane.showInputDialog(" Digite sus apellidos: ");
     
         cedula= JOptionPane.showInputDialog("Digite su cedula: ");
        
         correo= JOptionPane.showInputDialog("DIigte su correo: ");
        
        String  telefono= JOptionPane.showInputDialog("Digite su telefono : ");
        
        telf = Integer.parseInt(telefono);
        
        JOptionPane.showMessageDialog(null,"Su carnet de la  biblioteca esta listo "
                + "\n.Nombre: "+nombre
                +"\n.Apellidos: "+apellidos
                +"\n.cedula : "+cedula
                +" "+" \n.numero de telefono : "+ telf
                +" "+"\n.Correo:"+ correo);
               
        
    }
   
   
   
   
   
   
   
   
}
