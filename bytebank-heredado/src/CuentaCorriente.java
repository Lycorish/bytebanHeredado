public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) throws ValoresInvalidosException {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.saca(valor + comision);
    }

    @Override
    public void depositar(double valor) {
        // throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

}
