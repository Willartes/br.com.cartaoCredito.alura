import java.util.LinkedList;
import java.util.List;

public class CartaoCredito {

    private double limiteTotal;
    private double saldoDisponivel;
    private List<Compra> listaCompras;

    public CartaoCredito(double limiteTotal) {
        this.limiteTotal = limiteTotal;
        this.saldoDisponivel = limiteTotal;
        this.listaCompras = new LinkedList<>();
    }

    public double getLimiteTotal() {
        return limiteTotal;
    }


    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }


    public List<Compra> getListaCompras() {
        return listaCompras;
    }
    

    public void debitar(double valor){
        this.saldoDisponivel -= valor;
    }

}
