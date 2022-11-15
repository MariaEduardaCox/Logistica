public class Caminhao extends VeiculoA{

    private int eixos;

    public Caminhao(String nome, String tipoVeiculo, String variacaoCombustivel, String placa, double consumoKm, int eixos) {
        super(nome, tipoVeiculo, variacaoCombustivel, placa, consumoKm);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
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
                "Eixos: " + eixos + "\n";

    }
}
