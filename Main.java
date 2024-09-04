import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.50, 1000.0);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Alterar quantidade de combustível");
            System.out.println("6. Ver total abastecido");
            System.out.println("7. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a ser abastecido: R$ ");
                    double valor = scanner.nextDouble();
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    System.out.print("Informe a quantidade em litros: ");
                    double litros = scanner.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    System.out.print("Informe o novo valor do litro: R$ ");
                    double novoValor = scanner.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Informe o novo tipo de combustível: ");
                    scanner.nextLine(); // Consumir a nova linha
                    String novoTipo = scanner.nextLine();
                    bomba.alterarCombustivel(novoTipo);
                    break;
                case 5:
                    System.out.print("Informe a nova quantidade de combustível: ");
                    double novaQuantidade = scanner.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQuantidade);
                    break;
                case 6:
                    System.out.printf("Total já abastecido: R$ %.2f\n", bomba.obtemTotalAbastecido());
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    
    }
}
