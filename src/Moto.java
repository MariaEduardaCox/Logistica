public class Moto extends VeiculoA{
    private double cilindradas;

    public Moto(String nome, String tipoVeiculo, String variacaoCombustivel, String placa, double consumoKm, double cilindradas) {
        super(nome, tipoVeiculo, variacaoCombustivel, placa, consumoKm);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public double gastoCombustivel(double litro, double km, double distancia, double valorC){
      double lk = litro/km;
      double quilometragemTotal = distancia;
      double gastoTotal = quilometragemTotal * valorC;
      System.out.println("Sua moto faz: " + lk + "litros por km");
      System.out.println("Gasto total: " + gastoTotal);
        return lk;
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
                "Cilindradas: " + cilindradas + "\n";

    }


}
