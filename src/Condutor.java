public class Condutor {

    private String nome;
    private String cpf;
    private String dataN;
    private double salario;

    public Condutor(String nome, String cpf, String dataN, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataN = dataN;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
