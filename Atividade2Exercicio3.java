package Java;
import java.util.Scanner;

public class Atividade2Exercicio3 {
    public static void main(String[] args) {
        int opcao, quantidade;
        double valorTotal;
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o código do item: ");
        opcao = read.nextInt();

        System.out.print("Insira a quantidade do item: ");
        quantidade = read.nextInt();

        switch (opcao) {
            case 1:
                valorTotal = quantidade * 10;
                System.out.println("Cachorro-quente");
                System.out.println("Valor total: R$ " + valorTotal);
                break;

            case 2:
                System.out.println("X-Salada");
                valorTotal = quantidade * 15;
                System.out.printf("Valor total: R$ %.2f", valorTotal);
                break;

            case 3:
                System.out.println("X-Bacon");
                valorTotal = quantidade * 18;
                System.out.printf("Valor total: R$ %.2f", valorTotal);
                break;

            case 4:
                System.out.println("Bauru");
                valorTotal = quantidade * 12;
                System.out.printf("Valor total: R$ %.2f", valorTotal);
                break;

            case 5:
                System.out.println("Refrigerante");
                valorTotal = quantidade * 8;
                System.out.printf("Valor total: R$ %.2f", valorTotal);
                break;

            case 6:
                System.out.println("Suco de laranja");
                valorTotal = quantidade * 13;
                System.out.printf("Valor total: R$ %.2f", valorTotal);
                break;

            default:
                System.out.printf("\nOpçăo inválida!");
            }
        }
    }


