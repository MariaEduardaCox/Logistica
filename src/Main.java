import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<VeiculoA> veiculo = new ArrayList<>();

        List<Viagem> viagem = new ArrayList<>();

        List<Condutor> condutor = new ArrayList<>();



        Moto moto1 = new Moto("CG 160 Start", "Moto", "Gasolina", "BRA 0S17", 40, 160);
        veiculo.add( new Moto("CG 160 Titan", "Moto", "Gasolina", "ARB 0S18", 40, 160));
        veiculo.add( new Moto("CB Twister", "Moto", "Gasolina", "AAD 0A61",30,250));
        veiculo.add( new Moto("Hornet", "Moto", "Gasolina", "DAA 0A62", 25, 600));
        veiculo.add( new Moto("MT-07", "Moto", "Gasolina", "BCC 9J09", 25, 690));

        Carro carro1 = new Carro("Spacefox", "Carro", "Flex", "AMD 5N09", 13,4);
        veiculo.add(new Carro("Civic", "Carro", "Flex","MED 2N04", 15, 4));
        veiculo.add(new Carro("Compass 4xe", "Carro", "Híbrido", "HBU 9K08", 25, 4));
        veiculo.add(new Carro("Supra", "Carro", "Gasolina", "GHI 7C87", 7,4));
        veiculo.add(new Carro("Skyline GTR", "Carro", "Gasolina", "FNI 9D56", 7, 2));


        Caminhao caminhao1 = new Caminhao("Volvo FH 540", "Caminhão", "Diesel", "MKA 0G85", 1.4,3);
        veiculo.add(new Caminhao("Mercedes-Bens Actros", "Caminhão", "Diesel", "SSH 4N98", 2, 3));
        veiculo.add(new Caminhao("Scania R450", "Caminhão", "Diesel", "GVN 5S78", 1.6, 3));
        veiculo.add(new Caminhao("Volkswagen Meteor Optimus","Caminhão", "Diesel", "NBA 4B87", 2.3 , 3));
        veiculo.add(new Caminhao("Iveco S-Way", "Caminhão", "Diesel", "JAZ 7H89", 2.1 , 3));


        Condutor condutor1 = new Condutor("Alisson Nanias", "108678678-09", "28/04/1997", 8000);
        condutor.add(new Condutor("Mateus Carvalho", "887656786-19", "01/12/2000", 3000));
        condutor.add(new Condutor("Eric Atlanta", "678546287-56", "16/12/1989", 5000));
        condutor.add(new Condutor("Anthony Santos", "837598376-28", "09/04/1998", 3000));
        condutor.add(new Condutor("Dante Augusto", "872731378-37", "06/02/1970", 6000));


        Viagem viagem1 = new Viagem("Belém", "Sorocaba", 2840, "Spacefox", "Alisson");
        viagem.add(new Viagem("São Paulo", "Rio de Janeiro", 500, "CG 160 Start", "Mateus"));
        viagem.add(new Viagem("Belo Horizonte", "Campo Grande", 1200, "Volvo FH 540", "Pedro"));
        viagem.add(new Viagem("Salvador", "Teresina", 1150, "Civic", "Anthony"));
        viagem.add(new Viagem("Manaus", "Campos do Jordão", 10900, "Mercedes-Bens Actros", "Dante"));


        Relatorio.printCondutores(condutor);
        Relatorio.printVeiculos(veiculo);
        Relatorio.printViagens(viagem);

        FolhaDePagamento.imprimir(condutor);
        FolhaDePagamento.totalAPagar(condutor);

        System.out.println(moto1.gastoCombustivel(300, 4));
        System.out.println(carro1.gastoCombustivel(200, 5.0));
        System.out.println(caminhao1.gastoCombustivel(1000, 3));
        System.out.println(condutor1.getNome());
        System.out.println(viagem1.custoViagem(4.0,4.0,50));


    }
}