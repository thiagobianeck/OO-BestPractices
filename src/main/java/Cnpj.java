public class Cnpj {

    private String valor;

    public boolean ehValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private int segundoDigitoCorreto() {
        // TODO implementar
        return 2;
    }

    private int segundoDigitoVerificador() {
        // TODO implementar
        return 2;
    }

    private int primeiroDigitoCorreto() {
        // TODO implementar
        return 2;
    }

    private int primeiroDigitoVerificador() {
        // TODO implementar
        return 2;
    }
}
