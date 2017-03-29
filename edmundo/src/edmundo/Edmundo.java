/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edmundo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-203
 */
public class Edmundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ingreso = JOptionPane.
                showInputDialog(null,
                        "Ingrese un Año",
                        "Mi titulo",
                        JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("El año ingresado es : "+ingreso);
        
        int anio = Integer.parseInt(ingreso);
        anio++;
        
        System.out.println("El nuevo año es:"+anio);
        
        JOptionPane.showMessageDialog(null,
                "El nuevo año es:"+anio,
                "Mi titulo",
                JOptionPane.INFORMATION_MESSAGE);
                
                
        
                }
       
}
