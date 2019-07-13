public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, double valor) {

        if (valor > 100) {
            valor -= 8;
        }

        divida.setValorPago(divida.getValorPago() + valor);
    }
}
