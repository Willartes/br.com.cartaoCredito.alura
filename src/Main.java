import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.printf("Digite o limite do cartão: ");
        double saldo = leia.nextDouble();
        ServicoCompra comprado = new ServicoCompra();
        CartaoCredito cartao = new CartaoCredito(saldo);
        boolean continua = true;
        leia.nextLine();
        while (continua){

            System.out.printf("Digite a descrição da compra: ");
            String descricaoCompra = leia.nextLine();

            System.out.printf("Digite o valor da compra: ");
            double valorProduto = leia.nextDouble();
            Compra compra = new Compra(descricaoCompra, valorProduto);
            comprado.registrarCompra(cartao, compra);
            leia.nextLine();

            System.out.printf("Digite 0 para sair ou 1 para continuar: ");
            int opcao = leia.nextInt();
            leia.nextLine();
            if(opcao == 0){
                continua = false;
            }

        }


        comprado.ordenarCompras(cartao);
        comprado.listarCompras(cartao);
        leia.close();
    }
}