package ejercicio;

public class Coche {
    
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public int incrementaPuertas(){
        return this.numeroPuertas +=1;
    } 
    
}
