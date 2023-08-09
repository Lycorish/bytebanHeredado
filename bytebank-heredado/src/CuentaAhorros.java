public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia, int numero) throws ValoresInvalidosException {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {

        this.saldo = this.saldo + valor;

    }

}
