public class Viagem {

    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private Veiculo veiculo;
    private Condutor condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, Veiculo veiculo, Condutor condutor) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.condutor = condutor;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public double custoViagem(double gastoConsumo, double dias){
        gastoConsumo = veiculo.gastoCombustivel(1000,500,1000,5);
        dias = distancia/700;
        return (dias * (condutor.getSalario()/20)) + gastoConsumo;
    }
}
