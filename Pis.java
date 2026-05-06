package impostos;

public class Pis implements Imposto{
    private double debito;
    private double credito;
    
    public Pis(double debito, double credito){
        this.debito = debito;
        this.credito = credito;
    }
    
    @Override
    public double calcular(){
        return(debito - credito)*0.0165;
    }
    
    @Override
    public String getDescricao(){
        return"Pis";
    }
}