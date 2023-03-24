package appfuncion1;

import ejercicio.Coche;

public class main {
    
    //first part
    static void tresParametros (int num1,int num2,int num3){
        System.out.println(String.format("%s + %s + %s = %s", num1,num2,num3,num1+num2+num3));
    }
    
    public static void main(String[] args) {
     
        //first part function and print
        tresParametros(5, 5, 5);
        
        //second part. import class coche and create object 
        Coche miCoche = new Coche(1);
        int numeroPuertas = miCoche.incrementaPuertas();
        //print output
        System.out.println("El numero de puertas es : "+numeroPuertas);
    }
    
}

/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
*/
