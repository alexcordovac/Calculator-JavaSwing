package calc.servicios;
/**
 *
 * @author Alex
 */
public class CalcServices {
    private double temp = Double.NaN;
    private String ultimoOperador;
    
    public double calcular(double n2){
        double n1 = temp;
        double resultado=0;
        
        switch(this.ultimoOperador){
            case "+":
                resultado=n1+n2;
                break;
            case "-":
                resultado=n1-n2;
                break;
            case "*":
                resultado=n1*n2;
                break;
            case "/":
                resultado=n1/n2;
                break;
            case "mod":
                resultado=n1%n2;
                break;
        }
        return resultado;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getUltimoOperador() {
        return ultimoOperador;
    }

    public void setUltimoOperador(String ultimoOperador) {
        this.ultimoOperador = ultimoOperador;
    }
    
    public void imprimirMemoria(){
        System.out.println("Numero temporal: " + this.temp + ""
                + "\nUltimo operador: " + this.ultimoOperador);
    }
    
}