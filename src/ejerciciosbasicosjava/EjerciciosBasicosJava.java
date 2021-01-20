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
     * % es el mod (el resto de la división)
     */
    
    public boolean muyVanidoso (int numero){
        if (numero % 11 == 0 || numero % 11 == 1){// si la división da como resto cero o uno
            return true;
        }
        return false;
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
    }
    
}
