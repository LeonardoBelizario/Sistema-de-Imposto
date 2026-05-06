package impostos;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos{
    private String nomeEmpresa;
    private List<Imposto>impostos;
    
    public Pagamentos(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }
    
    public void adicionarImposto(Imposto imposto){
        impostos.add(imposto);
    }
    
    public void mostrarImpostos(){
        System.out.println("\nEmpresa: " + nomeEmpresa);
        for(Imposto i: impostos){
            System.out.printf("%s = R$%.2f%n", i.getDescricao(), i.calcular());

        }
    }
}