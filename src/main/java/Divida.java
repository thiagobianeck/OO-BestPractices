import java.util.ArrayList;
import java.util.Calendar;

public class Divida {

    private double total;
    private double valorPago;
    private String credor;
    private String cnpjCredor;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public boolean cnpjValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

    private int segundoDigitoCorretoParaCnpj() {
        // TODO implementar
        return 2;
    }

    private int segundoDigitoVerificadorDoCnpj() {
        // TODO implementar
        return 2;
    }

    private int primeiroDigitoCorretoParaCnpj() {
        // TODO implementar
        return 2;
    }

    private int primeiroDigitoVerificadorDoCnpj() {
        // TODO implementar
        return 2;
    }

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this.pagamentos) {
            if (pagamento.getData().before(data)){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this.pagamentos) {
            if (pagamento.getValor() > valorMinimo){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValorPago() {
        return valorPago;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public String getCnpjCredor() {
        return cnpjCredor;
    }

    public void setCnpjCredor(String cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    private void paga(double valor) {

        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido para pagamento");
        }
        if (valor > 100) {
            valor -= 8;
        }
        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());

    }
}
