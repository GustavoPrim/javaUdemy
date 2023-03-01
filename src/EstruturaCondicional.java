import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número é negativo");
        } else if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("Número neutro");
        }

        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }


        System.out.print("Digite o número 1: ");
        int numero1 = sc.nextInt();

        if (numero1 != 1) {
            System.out.println("O número não é o 1");
        } else {
            System.out.println("O número é o 1");
        }


        System.out.print("Digite um número: ");
        int numeroInformacoes = sc.nextInt();

        if (numeroInformacoes == 0) {
            System.out.println("O número é neutro");
        } else if (numeroInformacoes % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        if (numeroInformacoes > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        if (numeroInformacoes > 15) {
            System.out.println("O número é maior que 15");
        } else {
            System.out.println("O número é menor que 15");
        }
        if (numeroInformacoes <= 50) {
            System.out.println("O número é menor ou igual a 50");
        }
        if (numeroInformacoes < -10) {
            System.out.println("O número é menor que -10");
        } else {
            System.out.println("O número é maior que - 10");
        }
        if (numeroInformacoes >= 30) {
            System.out.println("Número é maior ou igual a 30");
        } else {
            System.out.println("Número é menor que 30");
        }
        if (numeroInformacoes != 1) {
            System.out.println("Número é diferente de 1");
        } else {
            System.out.println("Número é igual a 1");
        }
    }
}