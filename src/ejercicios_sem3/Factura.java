package ejercicios_sem3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Factura {
    public static void main (String [] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        
        Scanner leer = new Scanner (System.in);
        FacturaElectrica objeto = new FacturaElectrica();
        
        System.out.println("Ingrese su N° de cuenta");
        objeto.setNcuenta(leer.nextDouble());
        
        System.out.println("Numero de cuenta: " +objeto.getNcuenta());
        System.out.println("Lectura actual del medidor: "+objeto.getLecturaActualM() + ("kWh"));
        System.out.println("Lectura anterior del medidor: "+objeto.getLecturaAnteriorM()+("kWh"));
        System.out.println("Su consumo mensual es: " +objeto.consumo()+("kWh"));
        System.out.println("Su consumo diario es: " + formato.format(objeto.consumoD())+("kWh"));
        System.out.println("El valor de factura es: " +objeto.ValorFac());
        
    }
    
}