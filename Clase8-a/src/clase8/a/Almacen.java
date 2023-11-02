/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8.a;

/**
 *
 * @author viti
 */
public class Almacen {
    String name;
    int productos[];

    public Almacen(String name, int[] productos) {
        this.name = name;
        this.productos = productos;
    }

    public Almacen() {
        this.name = "Generico";
        this.productos = new int[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getProductos() {
        return productos;
    }

    public void setProductos(int[] productos) {
        this.productos = productos;
    }
    
    
}
