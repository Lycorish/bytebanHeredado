public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Contador();
        funcionario.setName("Rose");

        Gerente gerente = new Gerente();
        gerente.setName("Eve");

        funcionario.setSalary(200);
        gerente.setSalary(10000);
    }
}
