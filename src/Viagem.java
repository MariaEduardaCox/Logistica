
public class Viagem implements Comparable<Viagem>{

    private String cidadeOrigem;
    private String cidadeDestino;
    private double distancia;
    private String veiculo;
    private String condutor;

    public Viagem(String cidadeOrigem, String cidadeDestino, double distancia, String veiculo, String condutor) {
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

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    public double custoViagem(double gastoConsumo, double dias, double valorDiaria) {
        dias = distancia / 700;
        return dias * valorDiaria + gastoConsumo;
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
        Viagem v = (Viagem) other;
        return (int) (this.distancia - v.distancia);
    }
}
