package Ejercicios_Sem3;


public class Casa {
    String NumCasa;
    String Numpasaje;
    String NombreCalle;

    public Casa() {
    }

    public String getNumCasa() {
        this.NumCasa=("B22");
        return NumCasa;
    }

    public String getNumpasaje() {
        this.Numpasaje=("14");
        return Numpasaje;
    }

    public String getNombreCalle() {
        this.NombreCalle=("Florida");
        return NombreCalle;
    }
    public Casa(String NumCasa,String Numpasaje,String NombreCalle){
        this.NumCasa = NumCasa;
        this.Numpasaje = Numpasaje;
        this.NombreCalle = NombreCalle;
    }
    
    }

