public class Gerente extends Funcionario implements Autenticable {

    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 200;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClave'");
    }

    @Override
    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarSesion'");
    }

}
