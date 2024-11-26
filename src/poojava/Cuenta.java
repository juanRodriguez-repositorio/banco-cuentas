
package poojava;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta
public class Cuenta {
    
    private String Titular;
    public Cuenta impuestos;
    private long Saldo;
    private double cuatroxmil = 0.0004;
    
    Cuenta(Cliente estado){
        if(estado.getNombre().equals("Estado")){
            Titular = "Estado";
        }else{
            Titular = "Cuenta invalida";
        }
    }
    
    Cuenta(Cliente cliente, Cuenta ctaimpuestos) {
        Titular = cliente.getNombre();
        impuestos = ctaimpuestos;
    }

    boolean consignacion(long x){
        
        boolean peticion = true;
        
        if(peticion == true){
                
                if(Titular.equals("Estado")){
                    Saldo = Saldo + x;
                }else{
                    double impuesto = x*cuatroxmil;
                    long y = x-Math.round(impuesto);
                    Saldo = Saldo + y;
                    impuestos.consignacion(Math.round(impuesto));
                }
 
                return true;
        }else{
            return false;
        }  
    }
    
    boolean retiro(long x){
        boolean peticion = true;
        
        if(peticion == true){
            double impuesto = x*cuatroxmil;
            Saldo = Saldo - (Math.round(impuesto)+x);
            impuestos.consignacion(Math.round(impuesto));
            return true;
        }else{
            return false;
        }
    }
    
    boolean transferencia(long x, Cuenta receptor){
        boolean peticion = true;
        
        if (peticion == true){
            double impuesto = x*cuatroxmil;
            Saldo = Saldo - (Math.round(impuesto)+x);
            impuestos.consignacion(Math.round(impuesto));
            receptor.transferenciaReceptor(x);
            return true;
        }else{
            return false;
        }
        
    }
    boolean transferenciaReceptor(long x){
        boolean peticion = true;
        if (peticion == true){
            Saldo = Saldo + x;
            return true;
        }else{
            return false;
        }
    }
    long getSaldo() {
        return this.Saldo;
    }
}
