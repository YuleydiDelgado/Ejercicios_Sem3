package ejercicios_sem3;

import java.util.Scanner;


public class Rempleados {
    
    public String bandera(int opcion){
        String estado="";
        if (opcion==1){estado = "activo";}
        else if(opcion==2){estado ="inactivo";}
        return estado;
    }
        
    public static void main(String [] asrg) {
        Rempleados emp = new Rempleados();
       
        Scanner leer = new Scanner (System.in);
        
        Empleado objeto = new Empleado();
        
        System.out.println("Ingrese su salario:");
        objeto.setSalarioDevengado(Double.parseDouble(leer.nextLine()));
        System.out.println("Ingrese 1 si el empleado esta Activo o 2 si esta Inactivo");
        int opcion = Integer.parseInt(leer.nextLine());
        
        
        System.out.println("El numero de Nit es: " +objeto.getNnit());
        System.out.println("Los apellidos son: " +objeto.getApellidos());
        System.out.println("Los nombres son: " +objeto.getNombres());
        System.out.println("La direccion es: " +objeto.getDireccion());
        System.out.println("El salario devengado es de: $" +objeto.Renta());
        System.out.println("Estado del empleado: " +emp.bandera(opcion));
        
        
        
    }
    }

