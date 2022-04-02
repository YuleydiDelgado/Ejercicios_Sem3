package Ejercicios_Sem3;


public class Iva {
    double iva;
    double precio;

    public Iva(double iva, double precio) {
        this.iva = iva;
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double suma() {
        double Suma;
        Suma=(this.precio * this.iva);
        return Suma;
    }
    
    public double calculo1(){
        double Calculo;
    
         Calculo=(this.precio + this.suma());
         return Calculo;
    }
    public double resta(){
        double Resta;
        Resta=(this.precio * this.iva);
        return Resta;
    }

    public Iva() {
    }
    public double calculo2(){
        double Calculo2;
        
        Calculo2 =(this.precio - this.resta());
        return Calculo2;
    
        
         
        
    }
}
