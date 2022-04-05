package ejercicios_sem3;


public class Empleado {
    String Nnit;
    String apellidos;
    String nombres;
    String direccion;
    double salarioDevengado;
    double salarioDescuento;
 
    public Empleado() {
    }

    public Empleado(String Nnit, String apellidos, String nombres, String direccion, double salarioDevengado, double salarioDescuento) {
        this.Nnit = Nnit;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.salarioDevengado = salarioDevengado;
        this.salarioDescuento = salarioDescuento;
    }

    public String getNnit() {
        this.Nnit=("00235478");
        return Nnit;
    }

    public void setNnit(String Nnit) {
        this.Nnit = Nnit;
    }

    public String getApellidos() {
        this.apellidos=("Silvia Delgado");
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        this.nombres=("Mirna Gonzales");
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        this.direccion=("La Cruz");
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioDescuento() {
        return salarioDescuento;
    }

    public void setSalarioDescuento(double salarioDescuento) {
        this.salarioDescuento = salarioDescuento;
    }
    public double Renta(){
        double renta;
        double descuento;
        renta=(this.salarioDevengado  * 0.10);
        descuento =(this.salarioDevengado - renta);
        return descuento;
    }

    
}