/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmundo.main;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-203
 */
public class Jose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         String numb1 = JOptionPane.
                showInputDialog(null,
                        "Ingrese un numero",
                        "Mi titulo",
                        JOptionPane.INFORMATION_MESSAGE);
        
         
          String numb2 = JOptionPane.
                showInputDialog(null,
                        "Ingrese un numero 2",
                        "Mi titulo",
                        JOptionPane.INFORMATION_MESSAGE);
        
          
          int numero1, numero2,resultado;
          numero1 = Integer.parseInt(numb1);
          numero2 = Integer.parseInt(numb2);
          resultado = numero1*numero2;
          
          System.out.println("Rsultado"+resultado);
          
        // TODO code application logic here
    }
    
}
