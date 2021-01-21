/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author usuario
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuántas bellotas haya
        if (finDeSemana){
            return true;
        }
        //si llega aquí es que no es fin de semana
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        
        return false;
    }
    
   /**
    * @param 
    * multa: Si la velocidad es de 60 o menos, el resultado 
    */
    
    public int multa (int velocidad, boolean birthday){
        if (birthday){
            velocidad = velocidad - 5; //velocidad -= 5;
        }
        //si va amenos de 60 por hora devuleve 0
        if (velocidad <= 60){
            return 0; // no hay multa
        }
        //si va entre 91 y 80 devuelve 1
        if (velocidad > 60 && velocidad <= 80){
            return 1;// hay multa pequeña
        }
        // en cualquier otro valor que tuviera velocidad devolvemoms el 2, la multa grande
        return 2;
    }
    
    /**
     * @param numero el numero a evaluar si es o no vanidoso. es vanidoso si
     * es múltiplo de 11 o uno más de múltiplo de 11
     * % es el mod (el resto de la división) lo que queda de la division
     */
    
    public boolean muyVanidoso (int numero){
        if (numero % 11 == 0 || numero % 11 == 1){// si la división da como resto cero o uno
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param contesta excepto por las mañanas que solo contestamos si es mi madre
     * y nunca contestaremos si estamos dormidos
     */
    
    public boolean contesta (boolean matinal, boolean madre, boolean dormido){
        if (matinal == true){
            return false;
        }
        if (dormido == true){
            return false;
        }
        if (madre == true && matinal == true){
            return true;
        }
           
        return true;
    }
    
    /**
     * 
     * @param menorPor10 tiene que devolver true si uno de ellos es 10 menos
     * que uno de los otros
     */
    
    public boolean menorPor10(int a, int b, int c){
        if (a - b == 10 || a - c == 10){
            return true;
        }
        if (b - a == 10 || b - c == 10){
            return true;
        }
        if ( c - a == 10 || c - b == 10){
            return true;
        }
            
        return false;
    }
    
    /**
     * 
     * @param devuelve true si hay un digito que aparece en los dos números
     */
    
    public boolean digitoIgual (int a, int b){
        if (a/10 == b / 10 || a % 10 == b % 10){
            return true;
        }
        if (a / 10 == b % 10 || b / 10 == a % 10){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param devielve verdadero si un número positivo es múltiplo de 3 ó de 5
     * pero no de ambos
     */
    
    public boolean multiploMultiple (int numero){
        if (numero % 3 ==0 && numero % 5 ==0){
            return false;
        }
        if (numero % 3 == 0 || numero % 5 == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param args 
     */
    
    public boolean menos20 (int numero){
        if ( (numero +1) % 20 == 0 || (numero + 2) % 20 == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param args 
     */
    
    public int loteria (int a, int b, int c){
       if (a == 2 && b == 2 && c == 2){
        return 10;
       }
       if (a != 2 && a == b && b == c){
           return 5;
       }
       if (b != a && c != a){
           return 1;
       }
        return 0;
    }
    public static void main(String[] args) {
        //creamos un objeto de la clase en la qie estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        System.out.println("Ejercicio 01 ardillas");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        System.out.println("Ejercicio 02 multas");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        
        System.out.println("Ejercicio 03 muyVanidoso");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
                
        System.out.println("Ejercicio 04 contesta");
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, false));
        
        System.out.println("Ejercicio 05 menorPor10");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        
        System.out.println("Ejercicio 06 digitoIgual");
        System.out.println(ejercicio.digitoIgual(12, 23));
        System.out.println(ejercicio.digitoIgual(12, 43));
        System.out.println(ejercicio.digitoIgual(12, 44));
        
        System.out.println("Ejercicio 07 multiploMultiple");
        System.out.println(ejercicio.multiploMultiple(3));
        System.out.println(ejercicio.multiploMultiple(10));
        System.out.println(ejercicio.multiploMultiple(15));
        
        System.out.println("Ejercicio 08 menos20");
        System.out.println(ejercicio.menos20(18));
        System.out.println(ejercicio.menos20(19));
        System.out.println(ejercicio.menos20(20));
        
        System.out.println("Ejercicio 09 loteria");
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(2, 2, 1));
        System.out.println(ejercicio.loteria(0, 0, 0));
    }
    
}
