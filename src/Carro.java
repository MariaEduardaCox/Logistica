public class Carro extends VeiculoA{

    private int qtdPortas;

    public Carro(String nome, String tipoVeiculo, String variacaoCombustivel, String placa, double consumoKm, int qtdPortas) {
        super(nome, tipoVeiculo, variacaoCombustivel, placa, consumoKm);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void setTipoCombustivel(String tipoComsbutivel){

    }
    @Override
    public String getTipoCombustivel(String tipoComsbutivel){
        return tipoComsbutivel;
    }
    @Override
    public void setConsumo(double consumo){

    }
    @Override
    public double getConsumo(double consumo){
        return consumo;
    }
    @Override
    public void setPlacaV(String placaV){

    }
    @Override
    public String getPlacaV(String placaV){
        return placaV;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "Tipo do veículo: " + tipoVeiculo + "\n" +
                "Tipo do combustível: " + variacaoCombustivel + "\n" +
                "Placa: " + placa + "\n" +
                "Consumo km: " + consumoKm + "\n" +
                "Quantidade de portas: " + qtdPortas + "\n";

    }
}
