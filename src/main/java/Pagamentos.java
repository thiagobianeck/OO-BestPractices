import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class Pagamentos extends HashSet<Pagamento> {

    private double valorPago;

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
        this.add(pagamento);
        this.paga(pagamento.getValor());
    }

    @Override
    public boolean add(Pagamento pagamento) {
        this.paga(pagamento.getValor());
        return super.add(pagamento);
    }

    @Override
    public boolean addAll(Collection<? extends Pagamento> c) {

        return super.addAll(c);
    }

    public double getValorPago() {
        return valorPago;
    }

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this) {
            if (pagamento.getData().before(data)){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for(Pagamento pagamento : this) {
            if (pagamento.getValor() > valorMinimo){
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
}
