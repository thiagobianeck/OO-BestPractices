import java.util.Arrays;

public class TestaPagamentos {

    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();

        Pagamento pagamento1 = new Pagamento();
        pagamento1.setValor(105);

        Pagamento pagamento2 = new Pagamento();
        pagamento2.setValor(25);

        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);

        System.out.println("Valor Total pago: " + pagamentos.getValorPago());

        Pagamentos pagamentos2 = new Pagamentos();
        pagamentos2.addAll(Arrays.asList(pagamento1, pagamento2));
        System.out.println("Valor Total pago em pagamentos2: " + pagamentos2.getValorPago());

    }
}
