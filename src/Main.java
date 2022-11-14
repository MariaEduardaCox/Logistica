public class Main {
    public static void main(String[] args) {

        Moto moto1 = new Moto("CG 160 Start", "Moto", "Gasolina", "BRA 0S17", 40, 160 );
        Moto moto2 = new Moto("CG 160 Titan", "Moto", "Gasolina", "ARB 0S18", 40, 160);
        Moto moto3 = new Moto("CB Twister", "Moto", "Gasolina", "AAD 0A61",30,250);
        Moto moto4 = new Moto("Hornet", "Moto", "Gasolina", "DAA 0A62", 25, 600);
        Moto moto5 = new Moto("MT-07", "Moto", "Gasolina", "BCC 9J09", 25, 690);
        System.out.println(moto1.toString());

        Carro carro1 = new Carro("Spacefox", "Carro", "Flex", "AMD 5N09", 13,4);
        Carro carro2 = new Carro("Civic", "Carro", "Flex","MED 2N04", 15, 4);
        Carro carro3 = new Carro("Compass 4xe", "Carro", "Híbrido", "HBU 9K08", 25, 4);
        Carro carro4 = new Carro("Supra", "Carro", "Gasolina", "GHI 7C87", 7,4);
        Carro carro5 = new Carro("Skyline GTR", "Carro", "Gasolina", "FNI 9D56", 7, 2);
        System.out.println(carro1.toString());

        Caminhao caminhao1 = new Caminhao("Volvo FH 540", "Caminhão", "Diesel", "MKA 0G85", 1.4,3);
        Caminhao caminhao2 = new Caminhao("Mercedes-Bens Actros", "Caminhão", "Diesel", "SSH 4N98", 2, 3);
        Caminhao caminhao3 = new Caminhao("Scania R450", "Caminhão", "Diesel", "GVN 5S78", 1.6, 3);
        Caminhao caminhao4 = new Caminhao("Volkswagen Meteor Optimus","Caminhão", "Diesel", "NBA 4B87", 2.3 , 3);
        Caminhao caminhao5 = new Caminhao("Iveco S-Way", "Caminhão", "Diesel", "JAZ 7H89", 2.1 , 3);
        System.out.println(caminhao1.toString());

        Condutor condutor1 = new Condutor("Alisson Nanias", "108678678-09", "28/04/1997", 8000);
        Condutor condutor2 = new Condutor("Mateus Carvalho", "887656786-19", "01/12/2000", 3000);
        Condutor condutor3 = new Condutor("Eric Atlanta", "678546287-56", "16/12/1989", 5000);
        Condutor condutor4 = new Condutor("Anthony Santos", "837598376-28", "09/04/1998", 3000);
        Condutor condutor5 = new Condutor("Dante Augusto", "872731378-37", "06/02/1970", 6000);
        System.out.println(condutor1.toString());

        Viagem viagem1 = new Viagem("Belém", "Sorocaba", 2840, carro1, condutor1);
        Viagem viagem2 = new Viagem("São Paulo", "Rio de Janeiro", 500, moto1, condutor2);
        Viagem viagem3 = new Viagem("Belo Horizonte", "Campo Grande", 1200, caminhao1, condutor3);
        Viagem viagem4 = new Viagem("Salvador", "Teresina", 1150, carro2, condutor4);
        Viagem viagem5 = new Viagem("Manaus", "Campos do Jordão", 10900, caminhao2, condutor5);
        System.out.println(viagem1.toString());

    }
}