/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack_clases;

/**
 *
 * @author axelu
 */
public class Venta {
    /* atributos*/
    public int numero;
    public String nombreCliente;
    public String nombreProducto;
    public int cantidad;
    
    /*constructores*/
    public Venta() {
        
    }
    public Venta( int numero, String nombreCliente,String nombreProducto,int cantidad) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }
    
    /*Operaciones*/
    
    public double ImporteCompra(){
        if(nombreProducto.equals("TV Led 50 SAMSUNG")) 
            return 2550 * cantidad;
        else if(nombreProducto.equals("Lavadora LG 15 KG"))
            return 1200 * cantidad;
        else if(nombreProducto.equals("Refrigeradora DAEWOO 320 LT"))
            return 1800 + cantidad;
        else if(nombreProducto.equals("TV Led 60 LG"))
            return 2900 * cantidad;
        else
            return 0;
    }
    
}
