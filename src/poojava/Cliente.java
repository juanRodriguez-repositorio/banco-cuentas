/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author kamus
 */
public class Cliente {
    
    private String nombre;
    private int id;
    
    public void cliente(String nombre,int id){
    
        this.nombre=nombre;
        this.id=id;
    }
    
    public String obtenerNombre(){
    
        return this.nombre;
    }
    
}
