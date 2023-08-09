public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario lisa = new Contador();
        lisa.setName("Lisa");
        lisa.setDocument("Lisa 45");
        lisa.setSalary(4000);

        System.out.println(lisa.getSalary());
        System.out.println(lisa.getBonificacion());
    }
}
