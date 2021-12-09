/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import javax.swing.JOptionPane;
public class Categoria 
{
    Carnet redireccion=new Carnet();
    Factura redireccion2=new Factura();
    private String Catalogo[][]=new String[6][6]; 
    public void lista()
    {
       Catalogo[0][0]= "libros";
       Catalogo[1][0]= "Accion";
       Catalogo[2][0]= "Suspenso";
       Catalogo[3][0]= "Romance";
       Catalogo[4][0]= "Historia";
       Catalogo[5][0]= "Autobiografias";
       Catalogo[0][1]= "1";
       Catalogo[0][2]= "2";
       Catalogo[0][3]= "3";
       Catalogo[0][4]= "4";
       Catalogo[0][5]= "5";
       Catalogo[1][1]= "El codigo de DaVinci";
       Catalogo[1][2]= "El señor de los anillos";
       Catalogo[1][3]= "Assasin's creed";      
       Catalogo[1][4]= "Soy Leyenda";       
       Catalogo[1][5]= "Dune";       
       Catalogo[2][1]= "It";       
       Catalogo[2][2]= "El resplandor";       
       Catalogo[2][3]= "Perdida";       
       Catalogo[2][4]= "El Silencio de los Inocentes";       
       Catalogo[2][5]= "El Psicoanalista";       
       Catalogo[3][1]= "Bajo la misma estrella";       
       Catalogo[3][2]= "Romeo y Julieta";       
       Catalogo[3][3]= "El Ruiseñor";       
       Catalogo[3][4]= "Un dia de diciembre";       
       Catalogo[3][5]= "El dia que el cielo se caiga";       
       Catalogo[4][1]= "Biografia de la humanidad";
       Catalogo[4][2]= "La enciclopedia Nazi: Contada para escépticos";       
       Catalogo[4][3]= "Cien años de soledad";       
       Catalogo[4][4]= "Historia del mundo contada para escépticos";       
       Catalogo[4][5]= "Pretérito imperfecto";       
       Catalogo[5][1]= "Albert Einstein: Creador y Rebelde";       
       Catalogo[5][2]= "El diario de Anne Frank";       
       Catalogo[5][3]= "Will";      
       Catalogo[5][4]= "Un largo camino hacia la libertad";
       Catalogo[5][5]= "Leonardo da Vinci: Arte y ciencia del universo";     
       
       String resultado = "";
       for(int FILAS =0;FILAS < Catalogo.length ;FILAS++)
       {
           for(int COLUM =0;COLUM < Catalogo[FILAS].length;COLUM++)
           {
               resultado += Catalogo[FILAS][COLUM];
               resultado += "    ";
           }
           resultado += "\n";
       }
       JOptionPane.showMessageDialog(null, resultado);
       
       int opcion;
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacar un libro?"+"\n"+"1. Sacar libro"+"\n"+"0. Volver al menu principal"));
       if(opcion == 1)
       {
           sacar_libro();
       }
       else
       {
          JOptionPane.showMessageDialog(null, "Devolviendo al menu principal");
       }

    }
    public void sacar_libro()
    {
        String opcion;
        int opcion2;
        int opcion3;
        String resultado = "";
        opcion = JOptionPane.showInputDialog(null, "Ingrese el nombre del libro que desea sacar *Escribalo tal y como aparece en la lista*");
        if(opcion.equals("El codigo de DaVinci"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El señor de los anillos"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Assasin's creed"))
        {
            
        }
        if(opcion.equals("Soy Leyenda"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Dune"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("It"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El resplandor"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Perdida"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El Silencio de los Inocentes"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El Psicoanalista"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Bajo la misma estrella"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Romeo y Julieta"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El Ruiseñor"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Un dia de diciembre"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El dia que el cielo se caiga"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Biografia de la humanidad"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("La enciclopedia Nazi: Contada para escépticos"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Cien años de soledad"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Pretérito imperfecto"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Historia del mundo contada para escépticos"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Albert Einstein: Creador y Rebelde"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("El diario de Anne Frank"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Will"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Un largo camino hacia la libertad"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        if(opcion.equals("Leonardo da Vinci: Arte y ciencia del universo"))
        {
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Usted tiene carnet?? \n"+"1. Si \n"+"2. No"));
            if(opcion2 == 1)
            {
                redireccion2.Facturador();
            }
            if(opcion2 == 2)
            {
                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea sacarse un carnet \n"+"1. Si \n"+"2. No"));
                if(opcion3 == 1)
                {
                    redireccion.RegistroCarnet();
                }
                else
                {
                    lista();
                }
            }
        }
        
    } 
}
