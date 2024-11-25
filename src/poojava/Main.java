/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poojava;
import java.util.Scanner;

/**
 *
 * @author kamus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear clientes.
        Cliente nestor=new Cliente();
        nestor.cliente("nestor", 23);
        Cliente maria=new Cliente();
        maria.cliente("maria",24);
        Cliente pedro=new Cliente();
        pedro.cliente("pedro", 25);
        
        //crear cuentas.
        Cuenta nestorCuenta=new Cuenta();
        nestorCuenta.cuenta("nestor", 12334, 123);
        Cuenta mariaCuenta=new Cuenta();
        mariaCuenta.cuenta("maria", 23445, 124);
        Cuenta pedroCuenta=new Cuenta();
        pedroCuenta.cuenta("pedro", 23567, 125);
        //
        Scanner scanner=new Scanner(System.in);
        System.out.println("Elige una operacion: 1.Retirar, 2.Consignar");
        int opcion;
        
        try{
            opcion=scanner.nextInt();
            if(opcion==1){
                System.out.println("digite la cantidad a retirar:");
                double cantidad=scanner.nextDouble();
                int resultado=operacionRetirar();
                switch(resultado){
                
                    case 1:
                        boolean booleanoNestor=nestorCuenta.retirar(cantidad);
                        if(booleanoNestor){
                            mostrarResultadoRetirar(nestorCuenta,cantidad,"nestor");
                        }else{
                            System.out.println("no se puede retirar la cantidad de: "+cantidad+" por fondos insuficientes o cantidad invalida");
                            
                        }
                        break;
                    case 2:
                        boolean booleanoMaria=mariaCuenta.retirar(cantidad);
                        if(booleanoMaria){
                            mostrarResultadoRetirar(mariaCuenta,cantidad,"maria");
                        }else{
                            System.out.println("no se puede retirar la cantidad de: "+cantidad+" por fondos insuficientes o cantidad invalida");
                            
                        }
                        break;
                    case 3:
                        boolean booleanoPedro=pedroCuenta.retirar(cantidad);
                        if(booleanoPedro){
                             mostrarResultadoRetirar(pedroCuenta,cantidad,"pedro");
                        }else{
                            System.out.println("no se puede retirar la cantidad de: "+cantidad+" por fondos insuficientes o cantidad invalida");
                            
                        }
                        break;
                    default:
                        System.out.println("La opcion es invalida");
                        
                
                }
            }else if(opcion==2){
                System.out.println("Elige una opcion. 1.Consignar desde una cuenta, 2. Consignar en efectivo");
                try{
                    int num=scanner.nextInt();
                    int resultado=operacionConsignar(num);
                    System.out.println("digite la cantidad a consignar: ");
                    double cantidad=scanner.nextDouble();
                    switch(resultado){
                        case 1:
                            boolean booleanoNestor=Cuenta.consignar(cantidad, nestorCuenta);
                            if(booleanoNestor){
                                mostrarResultadoConsignacion(nestorCuenta,"nestor",cantidad);
                            }else{
                                System.out.println("Cantidad invalida");
                            }
                            break;
                        case 2:
                            boolean booleanoMaria=Cuenta.consignar(cantidad, mariaCuenta);
                            if(booleanoMaria){
                                mostrarResultadoConsignacion(mariaCuenta,"maria",cantidad);
                            }else{
                                System.out.println("Cantidad invalida");
                            }
                            break;
                        case 3:
                            boolean booleanoPedro=Cuenta.consignar(cantidad, pedroCuenta);
                            if(booleanoPedro){
                                mostrarResultadoConsignacion(pedroCuenta,"pedro",cantidad);
                            }else{
                                System.out.println("Cantidad invalida");
                            }
                            break;
                        case 12:
                            boolean booleanoNestorMaria=Cuenta.consignar(cantidad, nestorCuenta, mariaCuenta);
                            if(booleanoNestorMaria){
                                mostrarResultadoConsignacion(nestorCuenta,mariaCuenta,"nestor","maria",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        case 13:
                            boolean booleanoNestorPedro=Cuenta.consignar(cantidad, nestorCuenta, pedroCuenta);
                            if(booleanoNestorPedro){
                                mostrarResultadoConsignacion(nestorCuenta,pedroCuenta,"nestor","pedro",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        case 21:
                            boolean booleanoMariaNestor=Cuenta.consignar(cantidad, mariaCuenta, nestorCuenta);
                            if(booleanoMariaNestor){
                                mostrarResultadoConsignacion(mariaCuenta,nestorCuenta,"maria","nestor",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        case 23:
                            boolean booleanoMariaPedro=Cuenta.consignar(cantidad, mariaCuenta, pedroCuenta);
                            if(booleanoMariaPedro){
                                mostrarResultadoConsignacion(mariaCuenta,pedroCuenta,"maria","pedro",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        case 31:
                            boolean booleanoPedroNestor=Cuenta.consignar(cantidad, pedroCuenta, nestorCuenta);
                            if(booleanoPedroNestor){
                            
                                mostrarResultadoConsignacion(pedroCuenta,nestorCuenta,"pedro","nestor",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        case 32:
                            boolean booleanoPedroMaria=Cuenta.consignar(cantidad, pedroCuenta, mariaCuenta);
                            if(booleanoPedroMaria){
                                mostrarResultadoConsignacion(pedroCuenta,mariaCuenta,"pedro","maria",cantidad);
                            }else{
                                System.out.println("No se puede realizar la consignacion por fondos insuficientes o "
                                        + "cantidad invalida");
                            }
                            break;
                        default:
                            System.out.println("opcion invalida");
                    }
                }catch(Exception e){
                    System.out.println("entrada invalida");
                }
            }else{
                System.out.println("opcion invalida");
            }
        }catch(Exception e){
            System.out.println("entrada invalida");
        }
        
        
        
    }
    public static int operacionRetirar(){
        
        Scanner scanner=new Scanner(System.in);
        
        int opcion;
        System.out.println("elige una cuenta para retirar: 1.nestor, 2.maria, 3.pedro");
        try{
            opcion=scanner.nextInt();
        }catch(Exception e){
            
            return -1;
        }
        switch(opcion){
        
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return -1;
           
        }
                
    }
    public static int operacionConsignar(int num){
        Scanner scanner=new Scanner(System.in);
        switch(num){
            
            
            case 1:
                System.out.println("elige una cuenta: 1.nestor, 2.maria, 3.pedro");
                int opcion=validarEntrada(scanner);
                
                if(opcion==1){
                    System.out.println("cuenta a consignar: 2.maria, 3.pedro");
                    int opciones=validarEntrada(scanner);
                    switch(opciones){
                        case 2:
                            return 12;
                        case 3:
                            return 13;
                        default:
                            throw new IllegalArgumentException("-1");
                    }
                    
                }else if(opcion==2){
                    System.out.println("cuenta a consignar: 1.nestor, 3.pedro");
                    int opciones=validarEntrada(scanner);
                    switch(opciones){
                        case 1:
                            return 21;
                        case 3:
                            return 23;
                        default:
                            throw new IllegalArgumentException("-1");
                    }
                }else if(opcion==3){
                    System.out.println("cuenta a consignar: 1.nestor 2.maria");
                    int opciones=validarEntrada(scanner);
                    switch(opciones){
                        case 1:
                            return 31;
                        case 2:
                            return 32;
                        default:
                            throw new IllegalArgumentException("-1");
                    }
                }else{
                    throw new IllegalArgumentException("-1");
                }
            case 2:
                
                System.out.println("A que cuenta vas a consignar: 1.nestor, 2.maria, 3.pedro");
                int opcionConsignar=validarEntrada(scanner);
                switch(opcionConsignar){
                
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    default:
                        throw new IllegalArgumentException("-1");
                }
            default:
                throw new IllegalArgumentException("-1");
        }   
    
    }
    public static void mostrarResultadoConsignacion(Cuenta cuenta, String nombre, double cantidad){
    
        System.out.println("Consignacion de: "+cantidad+" exitosa");
        double saldo=cuenta.obtenerSaldo();
        System.out.println("Saldo actual de "+nombre+": "+saldo);
    }
    public static void mostrarResultadoConsignacion(Cuenta remitente,Cuenta beneficiario,String nombreRemitente, String nombreBeneficiario, double cantidad){
    
        System.out.println("Consignacion desde la cuenta de "+nombreRemitente+" a la "
                           + "cuenta de "+nombreBeneficiario+" de: "+cantidad+" fue exitosa");
        double saldoRemitente=remitente.obtenerSaldo();
        double saldoBeneficiario=beneficiario.obtenerSaldo();
        System.out.println("El saldo actual de "+nombreRemitente+" es: "+saldoRemitente+"$");
        System.out.println("El saldo actual de "+nombreBeneficiario+" es: "+saldoBeneficiario+"$");
    }
    
    public static void mostrarResultadoRetirar(Cuenta cuenta,double cantidad,String nombre){
    
        System.out.println("retiro de: "+ cantidad+"$" + " exitoso");
        double saldoActual=cuenta.obtenerSaldo();
        System.out.println("Saldo actual de "+nombre+": "+saldoActual);
    }
    public static int validarEntrada(Scanner scanner){
    
        try{
            int entrada=scanner.nextInt();
            return entrada;
        }catch(Exception e){
            throw new IllegalArgumentException("-1");
            
        }
        
    }
    
}
    
    

