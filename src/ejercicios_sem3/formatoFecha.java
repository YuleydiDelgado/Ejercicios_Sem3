package ejercicios_sem3;

import java.util.Scanner;


public class formatoFecha {
    String fecha;

    public formatoFecha() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public String formato(String fecha) { //
        String fechaformatoG ="";
        fechaformatoG += fecha.substring(0, 2) + "-";
        fechaformatoG += fecha.substring(2, 4) + "-";
        fechaformatoG += fecha.substring(4, 8);
        
        return fechaformatoG;
    }
    public String formato(int fecha) {
        String fecha1 = String.valueOf(fecha);
        String fechaformatoP ="";
        fechaformatoP += fecha1.substring(0, 2) + "/";
        fechaformatoP+= fecha1.substring(2, 4) + "/";
        fechaformatoP+= fecha1.substring(4, 8);
        
        
        return fechaformatoP;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         formatoFecha  formatoF = new formatoFecha();
         
        System.out.println("Introduzca la fecha");
        String fecha = leer.nextLine();
        formatoF.setFecha(fecha);
        
        System.out.println("Formato de fecha con guiones: " +formatoF.formato(fecha));
        System.out.println("Formato de fecha con plecas: " +formatoF.formato(Integer.parseInt(fecha)));
    }
    
}