/*
U. Fidelitas
Introduccion a la programacion
Sebastian Guerrero A. Kebelth Jose Vargas C.
7/11 hasta 8/12
Proyecto final
 */
package proyecto_final;

import javax.swing.JOptionPane;
public class Proyecto_final 
{


    public static void main(String[] args) 
    {
       Base_datos_trabajadores inicio1=new Base_datos_trabajadores("Juan Diego Campos","4568Campos");
       Base_datos_trabajadores inicio2=new Base_datos_trabajadores("Maria Fernanda Granado","mariposa24");
       Base_datos_trabajadores inicio3=new Base_datos_trabajadores("Keiren Alfaro Vega","Nashe");
       
       String inicio;
       
       inicio=JOptionPane.showInputDialog(null,"Ingrese su contraseña: ");
       if(inicio.equals("4568Campos"))
       {
           JOptionPane.showMessageDialog(null, inicio1);
           inicio1.mensaje();
           boolean salir= false;
       int opcion;
       Categoria mostrar0=new Categoria();
       Carnet mostrar1=new Carnet();
       Factura mostrar2 = new Factura();
       Devolucion mostrar3 = new Devolucion();
         while(!salir){
             JOptionPane.showMessageDialog(null, "Bienvenidos a La biblioteca Gothan");
             JOptionPane.showMessageDialog(null,"\n>>> MENÚ DE OPCIONES <<<"
                + "\n1.>>>Catalogo de libros ."
                + "\n2.>>>Crear un Carnet de la biblioteca ."
                +"\n3>>> Facturacion ."
                +"\n4>>> Devolucion de libros. "     
                + "\n5. Salir.");
                
            
             String opcion1   =JOptionPane.showInputDialog("\nIntroduzca opción (1-5):");  
              opcion=Integer.parseInt(opcion1);
             
              switch (opcion){
                  case 1:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 1");
                      mostrar0.lista();
                      
                      
                      
                      break;
                   case 2:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 2");
                      mostrar1.RegistroCarnet();
                      
                      
                      
                      break;
                   case 3:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 3");
                      mostrar2.Facturador();
                      
                      
                      break;
                   case 4:
                       JOptionPane.showMessageDialog(null, "has seleccionado la opcion 4");
                       mostrar3.ingresar_datos();
                       
                       
                       
                       break;
                   case 5:
                      JOptionPane.showMessageDialog(null,">>SALIENDO<<");
                      salir = true;
                      break;
                   default :
                         JOptionPane.showMessageDialog(null," solo numeros entre 1 y 5");
               }
              
            }
        }
       if(inicio.equals("mariposa24"))
       {
         JOptionPane.showMessageDialog(null, inicio2);
           inicio2.mensaje();
           boolean salir= false;
       int opcion;
       Categoria mostrar0=new Categoria();
       Carnet mostrar1=new Carnet();
       Factura mostrar2 = new Factura();
       Devolucion mostrar3 = new Devolucion();
         while(!salir){
             JOptionPane.showMessageDialog(null, "Bienvenidos a La biblioteca Gothan");
             JOptionPane.showMessageDialog(null,"\n>>> MENÚ DE OPCIONES <<<"
                + "\n1.>>>Catalogo de libros ."
                + "\n2.>>>Crear un Carnet de la biblioteca ."
                +"\n3>>> Facturacion ."
                +"\n4>>> Devolucion de libros. "
                + "\n5. Salir.");
                
            
             String opcion1   =JOptionPane.showInputDialog("\nIntroduzca opción (1-5):");  
              opcion=Integer.parseInt(opcion1);
             
              switch (opcion){
                  case 1:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 1");
                      mostrar0.lista();
                      
                      
                      
                      break;
                   case 2:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 2");
                      mostrar1.RegistroCarnet();
                      
                      
                      
                      break;
                   case 3:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 3");
                      mostrar2.Facturador();
                      
                      
                      break;
                   case 4:
                       JOptionPane.showMessageDialog(null, "has seleccionado la opcion 4");
                       mostrar3.ingresar_datos();
                       
                       
                       
                       break;
                   case 5:
                      JOptionPane.showMessageDialog(null,">>SALIENDO<<");
                      salir = true;
                      break;
                   default :
                         JOptionPane.showMessageDialog(null," solo numeros entre 1 y 5");
               }
              
            }  
       }
       if(inicio.equals("Nashe"))
       {
           JOptionPane.showMessageDialog(null, inicio3);
           inicio3.mensaje();
           boolean salir= false;
       int opcion;
       Categoria mostrar0=new Categoria();
       Carnet mostrar1=new Carnet();
       Factura mostrar2 = new Factura();
       Devolucion mostrar3 = new Devolucion();
         while(!salir){
             JOptionPane.showMessageDialog(null, "Bienvenidos a La biblioteca Gothan");
             JOptionPane.showMessageDialog(null,"\n>>> MENÚ DE OPCIONES <<<"
                + "\n1.>>>Catalogo de libros ."
                + "\n2.>>>Crear un Carnet de la biblioteca ."
                +"\n3>>> Facturacion ."
                +"\n4>>> Devolucion de libros. "
                + "\n5. Salir.");
                
            
             String opcion1   =JOptionPane.showInputDialog("\nIntroduzca opción (1-5):");  
              opcion=Integer.parseInt(opcion1);
             
              switch (opcion){
                  case 1:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 1");
                      mostrar0.lista();
                      
                      
                      
                      break;
                   case 2:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 2");
                      mostrar1.RegistroCarnet();
                      
                      
                      
                      break;
                   case 3:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 3");
                      mostrar2.Facturador();
                      
                      
                      break;
                      case 4:
                       JOptionPane.showMessageDialog(null, "has seleccionado la opcion 4");
                       mostrar3.ingresar_datos();
                       
                       
                       
                       break;
                   case 5:
                      JOptionPane.showMessageDialog(null,">>SALIENDO<<");
                      salir = true;
                      break;
                   default :
                         JOptionPane.showMessageDialog(null," solo numeros entre 1 y 5");
               }
              
            }
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Contrase;a Incorrecta");
       }
    }
    

    
    
       
        
      
        
}
        
    

