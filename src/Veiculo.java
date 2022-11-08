public interface Veiculo {

    public double gastoCombustivel(double litro, double km, double distancia, double valorC);
    public void setTipoCombustivel(String tipoComsbutivel);
    public String getTipoCombustivel(String tipoComsbutivel);
    public void setConsumo(double consumo);
    public double getConsumo(double consumo);
    public void setPlacaV(String placaV);
    public String getPlacaV(String placaV);


}
