package Ejercicios_sem3;

import java.util.Scanner;


public class Valor {
    public static void main(String [] asrg) {
        Scanner leer = new Scanner (System.in);
        
       Casa objeto = new Casa();
        
        System.out.println("El N° de su casa asignada es: " +objeto.getNumCasa());
        System.out.println("El numero de su pasaje es: " +objeto.getNumpasaje());
        System.out.println("El nombre de su calle asignada es: " +objeto.getNombreCalle());
        
        
        
    }
    
}
