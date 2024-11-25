package poojava;


import java.util.Scanner;

public class POOjava30Ejercicios {

    //imprimir por pantalla.
    public static void main(String[] args) {
        ejercicio_30();
    };
    public static void ejercicio_1(){
        System.out.println("hola, ya se imprimir frases");
    };
    public static void ejercicio_2(){
        System.out.println(4);
    };
    public static void ejercicio_3(){
        System.out.println(4.5);
    };
    //operaciones basicas y bucles.
    
    public static void ejercicio_4(){
        System.out.println(1234+532);
    };
    public static void ejercicio_5(){
        
        System.out.println(1234-532);
    };
    public static void ejercicio_6(){
        
        System.out.println(1234*532);
    };
    public static void ejercicio_7(){
        
        System.out.println((float) 1234/532);
    };
    public static void ejercicio_8(){
        
        for(int num=1;num<4;num++){
            //imprimir la variable num en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_9(){
        for(int num=1;num<10;num++){
            //imprimir la variable num en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_10(){
        for(int num=1;num<10001;num++){
            //imprimir la variable num en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_11(){
        for(int num=5;num<11;num++){
            //imprimir la variable en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_12(){
        for(int num=5;num<16;num++){
            //imprimir la variable en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_13(){
        for(int num=5;num<15001;num++){
            //imprimir la variable en cada vuelta.
            System.out.println(num);
        }
    };
    public static void ejercicio_14(){
        for(int num=1;num<201;num++){
            //imprimir la variable en cada vuelta.
            System.out.println(num+". "+"hola");
        }
    };
    public static void ejercicio_15(){
        for(int num=1;num<31;num++){
            //imprimir la variable en cada vuelta.
            System.out.println(num*num);
        }
    };
    public static void ejercicio_16(){
        //inicializar variable en 1 y declararla long para manejar el numero.
        long mul=1;
        for(int num=1;num<21;num++){
            //imprimir la variable en cada vuelta.
            mul*=num;
            
        }
        System.out.println(mul);
    };
    public static void ejercicio_17(){
        
        long sum=0;
        for(int num=1;num<101;num++){
            sum+=num*num;
        }
        System.out.println(sum);
                
    };
    //Leer desde el teclado, sentencia de condicion (if).
    public static void ejercicio_18(){
        //pedir numero entero y crear una instancia de Scanner.
        
        System.out.println("Ingresa un numero entero");
        Scanner scanner=new Scanner(System.in);
        
        //validar la entrada del usuario con un try/catch.
        
        try{
            //capturar la entrada del usuario y sumar los 100 numeros siguentes. 
            int num=scanner.nextInt();
            int sum=0;
            for(int i=num+1;i<=num+100;i++){
                sum+=i;
            }
            System.out.println("el resultado es: "+sum);
        }catch(Exception e){
            System.out.println("Entrada invalida,ingresa un numero entero");
        }
    };
    public static void ejercicio_19(){
        //Crear una instancia de Scanner.
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la cantidad en euros");
        
        //Usar un try/catch para manejar entradas invalidas.
        
        try{
            float euros=scanner.nextFloat();
            //convertir de euros a dolares con una tasa de cambio de 1.054.
            float dolares=euros*1.054f;
            //imprimir el resultado.
            System.out.println("Euros: "+euros+" euros");
            System.out.println("Dolares: "+dolares+" dolares");
        }catch(Exception e){
            System.out.println("entrada invalida");
        }
    };
    public static void ejercicio_20(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingrese la altura y la anchura del rectangulo");
        //Utilizar try/catch para manejar entradas invalidas.
        try{
            System.out.println("altura: ");
            double altura=scanner.nextDouble();
            System.out.println("anchura: ");
            double anchura=scanner.nextDouble();
            double area=altura*anchura;
            System.out.println("El area del rectangulo es: "+area);
        }catch(Exception e){
            System.out.println("Entrada invalida");
        }
    };
    public static void ejercicio_21(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Usar try/catch para manejar las entradas invalidas.
        try{
            System.out.println("Ingrese primer numero entero");
            int num1=scanner.nextInt();
            System.out.println("Ingrese segundo numero entero");
            int num2=scanner.nextInt();
            if(num1==num2){
                System.out.println("los dos numeros son iguales");
            }else if(num1>num2){
                System.out.println("El primer numero es mayor al segundo");
            }else{
                System.out.println("El segundo numero es mayor al primero");
            }
        }catch(Exception e){
            System.out.println("Entrada invalida, ingrese un numero entero");
        }
    };
    
    public static void ejercicio_22(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Usar try/catch para manejar entradas invalidas.
        try{
            System.out.println("ingrese un numero entero");
            int num=scanner.nextInt();
            //comprobar si los numeros menores que el ingresado son impares.
            for(int i=num-1;i>0;i--){
                if(i%2==1){
                    System.out.println("numero impar: "+i);
                }
            }
        }catch(Exception e){
            System.out.println("Entrada invalida, ingrese un numero entero");
        }
    }
    public static void ejercicio_23(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Utilizar try/catch para manejar entradas invalidas.
        try{
            System.out.println("ingrese primer numero entero");
            int num1=scanner.nextInt();
            System.out.println("ingrese segundo numero entero");
            int num2=scanner.nextInt();
            //si los numeros son iguales el mcd es el mismo numero.
            //si uno es mayor que otro se aplica el algoritmo de euclides.
            if(num1==num2){
                System.out.println("El maximo comun divisor es: "+num1);
            }else if(num1>num2){
                int residuo=num2;
                
                while(num1%num2!=0){
                    residuo=num1%num2;
                    num1=num2;
                    num2=residuo;
                }
                System.out.println("El maximo comun divisor de los dos numeros es: "+residuo);
            }else{
                int residuo=num1;
                
                while(num2%num1!=0){
                    residuo=num2%num1;
                    num2=num1;
                    num1=residuo;
                }
                System.out.println("El maximo comun divisor de los dos numeros es: "+residuo);
            }
            
        }catch(Exception e){
            System.out.println("entrada invalida, ingrese un nunero entero");
        }
    }
    
    public static void ejercicio_24(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese los coeficientes de la ecuacion cuadratica");
        
        //Utilizar try/catch para manejar entradas invalidas
        try{
            
            System.out.println("Ingresa el coeficiente a");
            float a=scanner.nextFloat();
            System.out.println("Ingresa el coeficiente b");
            float b=scanner.nextFloat();
            System.out.println("Ingresa el coeficiente c");
            float c=scanner.nextFloat();
            //calcular la raiz y determinar si tiene soluciones reales.
            float raiz=(float) Math.sqrt(b*b-4*a*c);
            if(a==0){
                throw new IllegalArgumentException("Entrada invalida");
            }
            if(Float.isNaN(raiz)){
                System.out.println("La ecuacion cuadratica no tiene solucion");
                
            }else{
                //calcular las soluciones reales.
                float solucion_1=(-b+raiz)/(2*a);
                float solucion_2=(-b-raiz)/(2*a);
                
                System.out.println("La primer solucion de la ecuacion es: "+solucion_1);
                System.out.println("La segunda solucion de la ecuacion es: "+solucion_2);
            }
            
        }catch(Exception e){
            System.out.println("La entrada es invalida");
        }
    }
    public static int ejercicio_25_factorial(int a){
        //definimos el caso base cuando a es igual a 1.
        //retornamos 1 cuando el valor ingresado es 0.
        if(a==1 || a==0){
            return 1;
        }else if(a<0){
            throw new IllegalArgumentException("entrada invalida, ingresa enteros positivos");
        }
        else{
            //uso recursivo de la funcion.
            return a*ejercicio_25_factorial(a-1);
        }
    }
    public static int ejercicio_25_Ackermann(int x,int y){
        //manejamos los valores negativos.
        if(x<0 || y<0){
            throw new IllegalArgumentException("Entrada invalida, ingresa enteros positivos");
        }
        //Implementamos la funcion recursiva de Ackermann.
        if(x==0){
            return y+1;
        }else if(y==0){
            return ejercicio_25_Ackermann(x-1,1);
        }else{
           return ejercicio_25_Ackermann(x-1,ejercicio_25_Ackermann(x,y-1)); 
        }
        
    }
    public static void ejercicio_25(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Utilizar try/catch para los casos donde las funciones recursivas lancen error
        try{
            System.out.println("ingrese una opcion: 1. Funcion Factorial, 2. Funcion Ackermann");
            int num=scanner.nextInt();
            if(num==1){
                System.out.println("ingresa un numero entero para sacarle su factorial");
                int numf=scanner.nextInt();
                int resultado=ejercicio_25_factorial(numf);
                System.out.println("El resultado es: "+resultado);
            }else if(num==2){
                System.out.println("Ingresa dos numeros");
                int x=scanner.nextInt();
                int y=scanner.nextInt();
                int result=ejercicio_25_Ackermann(x,y);
                System.out.println("El resultado es: "+result);
            }else{
                System.out.println("Opcion invalida");
            }
        }catch(Exception e){
            if(e.getMessage()!=null){
                System.out.println(e.getMessage());
            }else{
                System.out.println("entrada invalida");
            }
        }
        
    }
    public static void ejercicio_26(){
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Utilizar try/catch para manejar las entradas invalidas.
        try{
            System.out.println("Ingrese tres numeros");
            float num1=scanner.nextFloat();
            float num2=scanner.nextFloat();
            float num3=scanner.nextFloat();
            //definicion de los casos.
            if(num1>num2&&num2>=num3){
                System.out.println("El numero mayor es: "+num1+"y el menor es"+num3);
            }else if(num1>num2&& num3>=num2 && num1>num3){
                System.out.println("El numero mayor es: "+num1+"y el menor es"+num2);
            }else if(num2>num1 && num1>=num3 ){
                System.out.println("El numero mayor es: "+num2+"y el menor es: "+num3);
            }
            else if(num2>num1 && num3>=num1 && num2>num3){
                System.out.println("El numero mayor es: "+num2+"y el menor es: "+num1);
            }
            else if(num3>num2 && num2>=num1){
                System.out.println("El numero mayor es: "+num3+"y el menor es: "+num1);
            }
            else if(num3>num2 && num1>=num2 && num3>num1){
                System.out.println("El numero mayor es: "+num3+"y el menor es: "+num2);
            }
            else if(num3==num2 && num2==num1){
                System.out.println("Los tres numeros son iguales");
            }
        }catch(Exception e){
            System.out.println("La entrada es invalida");
        }
    }
    public static void ejercicio_27(){
    
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Utilizar try/catch para manejar las entradas invalidas.
        try{
            System.out.println("Escriba los grados en fahrenheit");
            float gf=scanner.nextFloat();
            float gc=(float)5/9*(gf-32);
            System.out.println("El resultado es celcius es: "+gc);
        }catch(Exception e){
            System.out.println("Entrada invalida");
        }
    }
    public static void ejercicio_28(){
    
        //Crear una instancia de Scanner.
        Scanner scanner=new Scanner(System.in);
        //Utilizar try/catch para manejar las entradas invalidas.
        try{
            System.out.println("ingrese una opcion: 1,2 o 3");
            int opcion=scanner.nextInt();
            switch(opcion){
            
                case 1:
                    System.out.println("ingresaste la opcion 1");
                    break;
                case 2:
                    System.out.println("ingresaste la opcion 2");
                    break;
                case 3:
                    System.out.println("ingresaste la opcion 3");
                    break;
                default:
                    System.out.println("no ingresaste una opcion valida");
                    break;
            }
        }catch(Exception e){
            System.out.println("Entrada invalida");
        }
    
    }
    public static void ejercicio_29(){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese datos CTRL+Z y enter para terminar :");

        // Leer datos en un bucle hasta que se detecte EOF
        while (scanner.hasNextLine()) { // Verifica si hay otra línea para leer
            String linea = scanner.nextLine();
            System.out.println("Leido: " + linea);
        }

        System.out.println("Fin de entrada detectado.");
        scanner.close();
    
    }
    public static void ejercicio_30(){
    
        int limite = 20; // Rango de números 

        System.out.println("Numeros primos entre 1 y " + limite + ":");

        // Primer bucle for: itera sobre todos los números desde 2 hasta el límite
        for (int i = 2; i <= limite; i++) {
            boolean esPrimo = true; // Inicializar con verdadero

            // Segundo bucle for: verifica si el número tiene divisores
            for (int j = 2; j <= Math.sqrt(i); j++) { 
                if (i % j == 0) { // Si el número es divisible por j, no es primo
                    esPrimo = false;
                    break; // Salir del bucle si ya se encontró un divisor
                }
            }

            // Si el número es primo, lo imprime
            if (esPrimo) {
                System.out.println(i);
            }
    
        }
    
    
    
    }
}