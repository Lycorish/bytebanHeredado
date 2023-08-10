//Entida Cuenta

public abstract class Cuenta {

    private Cliente titular = new Cliente();
    protected double saldo;
    private int agencia;
    private int numero;
    private static int cuentasCreadas = 0;

    public Cuenta(int agencia, int numero) throws ValoresInvalidosException {
        if (agencia <= 0 || numero <= 0) {
            throw new ValoresInvalidosException("Valors invalidos para agencia o numero");
        }
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Total de cuentas creadas: " + cuentasCreadas);

        Cuenta.cuentasCreadas++;

    }

    // No retorna valor
    public abstract void depositar(double valor);

    // retorna valor, y el valor a retornar se especifica en el tipo
    // de metodo
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) throws ValoresInvalidosException {
        if (agencia <= 0) {
            throw new ValoresInvalidosException("Valores invalidos");
        }
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) throws ValoresInvalidosException {
        if (numero <= 0) {
            throw new ValoresInvalidosException("No se permiten valores negativos");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getcuentasCreadas() {
        return cuentasCreadas;
    }
}