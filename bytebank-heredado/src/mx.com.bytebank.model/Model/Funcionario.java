public abstract class Funcionario {

    private String name;
    private String document;
    private double salary;
    private int type;

    public Funcionario() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getBonificacion();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
