
package alumnos;

import javax.swing.JOptionPane;

public class Alumnos {

    public static void main(String[] args) {
        // showMessageDialog con 4 parametros 
//        JOptionPane.showMessageDialog(null, "El mensahe", "El titulo", JOptionPane.INFORMATION_MESSAGE);
//     
//      String msg = JOptionPane.showInputDialog(null, "Introduce un mensaje");			
//      System.out.println(msg);
//     
      
      String[] botones = {"Boton A", "Boton B", "Boton C", "Boton D"};	
      int ventana = JOptionPane.showOptionDialog(null,"Pulsa un boton:","Javadesde0.com",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null,	botones, botones[0]);
      if(ventana == 0) {System.out.println("Opcion A");}
      else if(ventana == 1) {System.out.println("Boton B");}
      else if(ventana == 2) {JOptionPane.showMessageDialog(null , "Opcion B");}
      else if(ventana == 3) {System.out.println("Boton D");}
    }
    
}
