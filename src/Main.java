package impostos;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome da empresa: ");
        String nome = sc.nextLine();
        
        Pagamentos pagamentos = new Pagamentos(nome);
        
        while(true){
            System.out.print("\nDigite o tipo de imposto(PIS/IPI) ou 'pare': ");
            String tipo = sc.nextLine();
            
            if(tipo.equalsIgnoreCase("pare")){
                break;
            }
            
            if(tipo.equalsIgnoreCase("PIS")){
                System.out.print("Debito: ");
                double debito = sc.nextDouble();
                
                System.out.print("Credito: ");
                double credito = sc.nextDouble();
                sc.nextLine();
                
                pagamentos.adicionarImposto(new Pis(debito, credito));
            }
            
            else if(tipo.equalsIgnoreCase("IPI")){
                System.out.print("Valor do produto: ");
                double valor = sc.nextDouble();
                
                System.out.print("Frete: ");
                double frete = sc.nextDouble();
                
                System.out.print("Seguro: ");
                double seguro = sc.nextDouble();
                
                System.out.print("Outras despesas: ");
                double outras = sc.nextDouble();
                
                System.out.print("Aliquota (%)");
                double aliquota = sc.nextDouble();
                sc.nextLine();
                
                pagamentos.adicionarImposto(new Ipi(valor, frete, seguro, outras, aliquota));
            }
            else{
                System.out.println("Tipo invalido!");
            }
        }
        
        pagamentos.mostrarImpostos();
        
        sc.close();
    }
}