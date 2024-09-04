import java.util.Scanner;
public class BombaCombustivel{
    private String tipoCombustivel;   
    private double valorLitro = 4.0;
    private double quantidadeCombustivel;
    private double totalAbastecido;
    Scanner scanner = new Scanner(System.in);
   // construtor
       public BombaCombustivel(String tipoCombustivel,double valorLitro,double quantidadeCombustivel){
        System.out.println("Bem vindo(a) ao Posto!");
        System.out.println("Escolha o tipo de combustível");
        String inputString = scanner.nextLine();

           this.tipoCombustivel = inputString;
           this.valorLitro = valorLitro;
           this.quantidadeCombustivel = quantidadeCombustivel;
           this.totalAbastecido = 0.0;
       }
   
   // métodos
   
       public void abastecerPorValor(double valorAbastecido){
           double litros =  valorAbastecido / valorLitro;
           if(litros <= quantidadeCombustivel){
                quantidadeCombustivel -=litros;
                totalAbastecido += valorAbastecido;
                System.out.printf("Foram abastecidos %.2f litros. O valor total ficou em R$ %.2f\n",litros,valorAbastecido);
           }
       }
       
       public void abastecerPorLitro(double litrosAbastecidos){
            double valor = litrosAbastecidos * valorLitro;
            if(litrosAbastecidos <= quantidadeCombustivel){
                quantidadeCombustivel -= litrosAbastecidos;
                totalAbastecido += valor;
                System.out.printf("Valor a pagar : R$ %.2f por %.2f litros abastecidos\n",valor,litrosAbastecidos);
            }else{
                System.out.println("Quantidade de combustível insuficiente.");
            }
       }
   
       public void alterarValor(double novoValor){
            this.valorLitro = novoValor;
            System.out.printf("O novo valor do litro é de %.2f\n",novoValor);
        }
   
       public void alterarCombustivel(String outroCombustivel){
            this.tipoCombustivel = outroCombustivel;
            System.out.printf("O novo tipo de combustível é %s\n",tipoCombustivel);    
       }
   
       public void alterarQuantidadeCombustivel(double novaQuantidade){
            this.quantidadeCombustivel = novaQuantidade;
            System.out.printf("Nova quantidade de combustível: %.2f litros\n", quantidadeCombustivel);
       }

       public double obtemTotalAbastecido(){
            return totalAbastecido;
       }

   }