import java.util.*;
import static java.lang.Math.sqrt;

public class Operaciones {

    private Double n1;
    private Double n2;

    public Operaciones() {

    }

    private Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    private Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    //metodos personalizados


    public Double calcularSuma() {
        return n1 + n2;
    }

    public void calcularSumaImpresion(){
        Double suma = n1 + n2;
    }

    public void calcularResta(){
        Double resta = n1 - n2;
    }

    public void raiz(){
        System.out.println(sqrt(n1));
        System.out.println(sqrt(n2));
    }

}
