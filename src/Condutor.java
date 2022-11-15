public class Condutor implements Comparable {

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

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Data de nascimento: " + dataN + "\n" +
                "Salário: " + salario + "\n";

    }

    public int compareTo(Object other) {
        Condutor c = (Condutor) other;
        return this.cpf.compareTo(c.cpf);
    }
}
