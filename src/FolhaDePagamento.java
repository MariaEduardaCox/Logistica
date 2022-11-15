import java.util.List;

public class FolhaDePagamento {
    private String mes;
    private String ano;

    public FolhaDePagamento(String mes, String ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public static double totalAPagar(List<Condutor> condutores){
        double total = 0;
        for(Condutor i : condutores){
            total = total + i.getSalario();
        }
        return total;
    }

    public static void imprimir(List<Condutor> condutores){
        for(Condutor i : condutores){
            System.out.println("Nome: " + i.getNome() + "Salário: " + i.getSalario());
        }
        System.out.println(totalAPagar(condutores));
    }

}
