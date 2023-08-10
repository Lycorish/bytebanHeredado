
public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalary(6000);
        gerente.setClave("AluraCursosOnLine");
        gerente.setType(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
    }
}
