package ejercicios_sem3;

import java.util.Hashtable;
import java.util.Scanner;


public class Hashtable {
    public static void main(String[] args) {
        Estudiante objeto = new Estudiante(); 
    
        Scanner leer= new Scanner(System.in);
        Hashtable <String,String> Estudiante = new Hashtable <String,String>();
    
        for (int i = 1; i <=5; i++) {
            System.out.println("Ingrese el N° de carnet del estudiante: "+i);
            objeto.setNcarnet(leer.nextDouble());
      
        System.out.println("Ingrese el nombre de su carrera:" +i);
        objeto.setNcarrera(leer.next());
        
        System.out.println("Ingrese el codigo de la carrera:" +i);
        objeto.setCodigoC(leer.nextDouble());
    }
        
        for (int i= 1; i<=5; i++) {
        System.out.println("El numero de carnet del estudiante es: "+objeto.getNcarnet());
        System.out.println("El nombre de la carrera de el estudiante es: " +objeto.getNcarrera());
        System.out.println("El codigo del estudiante es: " +objeto.getCodigoC());
        Estudiante.put("a" +i,String.valueOf(Estudiante));
        
    }
    
}
}