import java.util.Scanner;

public class ListaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        int hora = 23;
        while (hora >= 0) {
            int minutos = 59;
            while (minutos >= 0) {
                int segundos = 59;
                while (segundos >= 0) {
                    System.out.println(hora + ":" + minutos + ":" + segundos);
                    segundos -= 1;
                }
                minutos -= 1;
            }
            hora -= 1;
        }

        // Exercício 02
        int opcaoEscolhida = 0;

        System.out.print("Digite um número: ");
        double primeiroNumeroUsuario = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double segundoNumeroUsuario = sc.nextDouble();

        while (opcaoEscolhida != 5){
            System.out.println("----------------MENU---------------------" +
"\n|1                        | Somar        |" +
"\n|2                        | Subtrair     |" +
"\n|3                        | Multiplicar  |" +
"\n|4                        | Dividir      |" +
"\n|5                        | Sair         |" +
"\n-----------------------------------------");

            System.out.print("Escolha uma opção: ");
            opcaoEscolhida = sc.nextInt();

            if (opcaoEscolhida == 1){
                System.out.println(
                        primeiroNumeroUsuario + " + " + segundoNumeroUsuario + " = " + (primeiroNumeroUsuario + segundoNumeroUsuario)
                );
            } if (opcaoEscolhida == 2) {
                System.out.println(
                        primeiroNumeroUsuario + " - " + segundoNumeroUsuario + " = " + (primeiroNumeroUsuario - segundoNumeroUsuario)
                );
            } if (opcaoEscolhida == 3){
                System.out.println(
                        primeiroNumeroUsuario + " * " + segundoNumeroUsuario + " = " + (primeiroNumeroUsuario * segundoNumeroUsuario)
                );
            } if (opcaoEscolhida == 4){
                System.out.println(
                        primeiroNumeroUsuario + " / " + segundoNumeroUsuario + " = " + (primeiroNumeroUsuario / segundoNumeroUsuario)
                );
            }

            // Exercício 03
            System.out.print("Informe um número: ");
            int numeroInformado = sc.nextInt();
            int tabuada = 0;

            while (tabuada <= 10){
                int total = numeroInformado * tabuada;
                System.out.println(numeroInformado + " * " + tabuada + " = " + total);
                tabuada = tabuada + 1;
            }

            // Exercício 04
            double valorTotal = 0, valorComDesconto = 0;
            int quantidadeProduto = 0, indice = 0;

            while (quantidadeProduto < 5){
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.next();

                System.out.print("Valor do produto: ");
                double valorProduto = sc.nextDouble();

                System.out.print("Quantidade de produtos: ");
                quantidadeProduto = sc.nextInt();

                indice = indice + 1;
                valorTotal = valorTotal + (valorProduto * quantidadeProduto);
            }
            valorComDesconto = valorTotal - 150;
            System.out.println("Valor com desconto: R$ " + valorComDesconto);
            System.out.println("Valor sem desconto: R$ " + valorTotal);
        }
    }
}