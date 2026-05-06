package impostos;

public class Ipi implements Imposto{
    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;
    
    public Ipi(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota){
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }
    
    @Override public double calcular(){
        double base = valorProduto + frete + seguro + outrasDespesas;
        return base * (aliquota/100);
    }
    
    @Override 
    public String getDescricao(){
        return"Ipi";
    }
}