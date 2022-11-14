
public class Viagem implements Comparable<Viagem>{

    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private VeiculoA veiculo;
    private Condutor condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, VeiculoA veiculo, Condutor condutor) {
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

    public void setVeiculo(VeiculoA veiculo) {
        this.veiculo = veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public double custoViagem(double gastoConsumo, double dias) {
        gastoConsumo = veiculo.gastoCombustivel(1000, 500, 1000, 5);
        dias = distancia / 700;
        return (dias * (condutor.getSalario() / 20)) + gastoConsumo;
    }

    @Override
    public String toString() {
        return "Cidade de origem: " + cidadeOrigem + "\n" +
                "Cidade de destino: " + cidadeDestino + "\n" +
                "Distância: " + distancia + "\n" +
                "Veículo: " + veiculo + "\n" +
                "Condutor: " + condutor + "\n";
    }

    @Override
    public int compareTo(Viagem other) {
        return (int) (this.custoViagem(100, 2)- other.custoViagem(50,2));
    }
}
