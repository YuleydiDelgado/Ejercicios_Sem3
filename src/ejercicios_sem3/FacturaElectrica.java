package ejercicios_sem3;


public class FacturaElectrica {
    double Ncuenta;
    double lecturaAnteriorM = 1087;
    double lecturaActualM = 3078;
    double multiplicador =10;
    String consumoM;
    String consumoD ;
    double valorFactura;

    public FacturaElectrica() {
    }

    public FacturaElectrica(double Ncuenta, double lecturaAnteriorM, double lecturaActualM, double multiplicador, String consumoM, String consumoD, double valorFactura) {
        this.Ncuenta = Ncuenta;
        this.lecturaAnteriorM = lecturaAnteriorM;
        this.lecturaActualM = lecturaActualM;
        this.multiplicador = multiplicador;
        this.consumoM = consumoM;
        this.consumoD = consumoD;
        this.valorFactura = valorFactura;
    }

    public double getNcuenta() {
        return Ncuenta;
    }

    public void setNcuenta(double Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public double getLecturaAnteriorM() {
        return lecturaAnteriorM;
    }

    public void setLecturaAnteriorM(double lecturaAnteriorM) {
        this.lecturaAnteriorM = lecturaAnteriorM;
    }

    public double getLecturaActualM() {
        return lecturaActualM;
    }

    public void setLecturaActualM(double lecturaActualM) {
        this.lecturaActualM = lecturaActualM;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getConsumoM() {
        return consumoM;
    }

    public void setConsumoM(String consumoM) {
        this.consumoM = consumoM;
    }

    public String getConsumoD() {
        return consumoD;
    }

    public void setConsumoD(String consumoD) {
        this.consumoD = consumoD;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    //consumo mensual
    public double consumo(){
        double Consumo;
        double R;
        Consumo=(this.lecturaActualM - this.lecturaAnteriorM);
        R=(Consumo * this.multiplicador);
        
        return R;
        
    }
    //consumo diario
    public double consumoD(){
        double ConsumoD;
        ConsumoD=(this.consumo() / 30);
        
        return ConsumoD;
        
    }
    //valor de factura
    double ValorFac(){
        double valor;
        valor=(this.consumo() * 0.20);
        
        return valor;
    }
    
    
        
    }