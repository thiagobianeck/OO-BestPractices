public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor) {
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(valor);
        pagamento.setPagador(nomePagador);
        pagamento.setCnpjPagador(cnpjPagador);

        divida.registra(pagamento);
    }
}
