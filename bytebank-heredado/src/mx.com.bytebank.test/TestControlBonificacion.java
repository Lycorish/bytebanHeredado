
public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario ado = new Contador();
        ado.setSalary(2000);

        Gerente yoasobi = new Gerente();
        yoasobi.setSalary(10000);

        Contador miku = new Contador();
        miku.setSalary(6000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(ado);
        controlBonificacion.registrarSalario(yoasobi);
        controlBonificacion.registrarSalario(miku);
    }
}
