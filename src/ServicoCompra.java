import java.util.Comparator;
import java.util.List;

public class ServicoCompra {

    public ServicoCompra() {
    }

    public boolean registrarCompra(CartaoCredito cartao, Compra compra){
        if(cartao.getSaldoDisponivel() < compra.getValor()){
            System.out.println("Saldo insuficiente para a compra: " + compra.getDescricao());
            return false;
        }
        cartao.debitar(compra.getValor());

        cartao.getListaCompras().add(compra);

        return true;
    }

    public void ordenarCompras(CartaoCredito cartao) {
        List<Compra> lista = cartao.getListaCompras();
        if(lista.isEmpty()){
            return;
        }
        lista.sort(Comparator.comparing(Compra :: getValor));
    }

    public void listarCompras(CartaoCredito cartao){

        if(cartao.getListaCompras().isEmpty()){
            return;
        }
        System.out.println("COMPRAS REALIZADAS:");
        for(Compra compra : cartao.getListaCompras()){
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }
        System.out.println("Saldo do cartão: " + cartao.getSaldoDisponivel());
    }


}
