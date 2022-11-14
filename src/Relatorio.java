import java.util.ArrayList;
import java.util.Collections;

public class Relatorio {

   public void printCondutores(List<Condutor> condutor){
       Collections.sort(condutor);
       for(Condutor c : condutor){
           System.out.println(c);
       }
   }

    public void printVeiculos(List<VeiculoA> veiculo){
        Collections.sort(veiculo);
        for(VeiculoA v : veiculo){
            System.out.println(v);
        }
    }

    public void printViagens(List<Viagem> viagem){
        Collections.sort(viagem);
        for(Viagem vi : viagem){
            System.out.println(vi);
        }
    }

}