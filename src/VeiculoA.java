public abstract class VeiculoA implements Veiculo{
    private String nome;
    private String tipoVeiculo;
    private String variacaoCombustivel;
    private String placa;
    private double consumoKm;

    public VeiculoA(String nome, String tipoVeiculo, String variacaoCombustivel, String placa, double consumoKm){
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.variacaoCombustivel = variacaoCombustivel;
        this.placa = placa;
        this.consumoKm = consumoKm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getVariacaoCombustivel() {
        return variacaoCombustivel;
    }

    public void setVariacaoCombustivel(String variacaoCombustivel) {
        this.variacaoCombustivel = variacaoCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getConsumoKm() {
        return consumoKm;
    }

    public void setConsumoKm(double consumoKm) {
        this.consumoKm = consumoKm;
    }
}

