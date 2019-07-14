import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cnpj cnpj = (Cnpj) o;

        return valor.equals(cnpj.valor);

    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}
