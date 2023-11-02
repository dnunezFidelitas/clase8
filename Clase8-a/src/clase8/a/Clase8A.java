/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8.a;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Clase8A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // utilizandoMetodosStaticsDelMain();
        utilizandoClaseVector();
        
       
        /*
        Almacen almacen1 = new Almacen();
        Almacen almacen2 = new Almacen("Lilis", new int[6] );
        System.err.println("almacen1 tamaño " + almacen1.getProductos().length);
        System.err.println("almacen2 tamaño " + almacen2.getProductos().length);*/
        
    }
    
    public static void utilizandoClaseVector(){
         Vector vector = new Vector();
         vector.solicitaData();
         vector.imprimeData();
    }
    
    public static void utilizandoMetodosStaticsDelMain(){
        int edad[] = new int[getLengthVector()]; 
        setEdades(edad);
        getEdades(edad);
    }
            
            
            
    public static int  getLengthVector(){
        return Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector"));
    }
    
    /**
     * Metodo que solicita data al usuario
     * @param edades
     * @return 
     */
    public static int[] setEdades (int[] edades){
        for (int i = 0; i < edades.length; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        }
        return edades;
    } 
    
    /**
     * metodo que imprime
     * @param edades 
     */
    public static void getEdades (int[] edades){
        for (int i = 0; i < edades.length; i++) {
           JOptionPane.showMessageDialog(null, edades[i]);
        }
    }
    
 
    
}
