/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8.a;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Vector {
    
    int edad[];
    
    public Vector(){
        this.edad = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector"))];
    }

    public Vector(int[] edad) {
        this.edad = edad;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public void solicitaData(){
         for (int i = 0; i < edad.length; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        }
    }
    
    public void imprimeData(){
        for (int i = 0; i < edad.length; i++) {
           JOptionPane.showMessageDialog(null, edad[i]);
        }
    }
  
    
    
    
}
