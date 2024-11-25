/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poojava;

/**
 *
 * @author kamus
 */
public class Cuenta {
    
    private String titular;
    private double saldo;
    private int id;
    
    public void cuenta(String titular, double saldo, int id){
            
        this.titular=titular;
        this.saldo=saldo;
        this.id=id;
    }
    public String obtenerTitular(){
    
        return this.titular;
    }
    public double obtenerSaldo(){
    
        return this.saldo;
    }
    public boolean retirar(double cantidad){
    
        if(cantidad<=this.saldo && cantidad>0){
            
            this.saldo-=cantidad;
            return true;
        }
        return false;
    }
    public static boolean consignar(double cantidad,Cuenta cuentaConsignar){
        
        if(cantidad>0){
            cuentaConsignar.saldo+=cantidad;
            return true;
        }
        return false;
    }
    public static boolean consignar(double cantidad,Cuenta cuenta, Cuenta cuentaConsignar){
        
        if(cantidad>0 && cuenta.saldo>=cantidad){
        
            cuentaConsignar.saldo+=cantidad;
            cuenta.saldo-=cantidad;
            return true;
        }
    
        return false;
    }
    
}
