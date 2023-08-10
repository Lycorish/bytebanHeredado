
public class SistemaInterno {

    private String clave = "AluraCursosOnLine";

    public boolean autentica(Autenticable gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("Login existoso");
            return true;
        } else {
            System.out.println("Error login");
            return false;
        }
    }
}
