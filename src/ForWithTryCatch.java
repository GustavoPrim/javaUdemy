import java.util.Locale;
import java.util.Scanner;

public class ForWithTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01
        System.out.print("Informe a quantidade de carros: ");
        int quantidadeCarros = sc.nextInt();
        int totalAnoCarros = 0, carrosComecaComG = 0, carrosComecaComA = 0, anoCarro = 0;
        double totalValorCarros = 0;
        boolean valorCarroValido = false, anoCarroValido = false;

        for (int i = 0; i < quantidadeCarros; i++) {
            System.out.print("Informe o modelo do carro: ");
            String modeloCarro = sc.next().toLowerCase().trim();
            if (modeloCarro.startsWith("g")) {
                carrosComecaComG++;
            }
            if (modeloCarro.startsWith("a")) {
                carrosComecaComA++;
            }
            valorCarroValido = false;
            anoCarroValido = false;

            while (valorCarroValido == false) {
                try {
                    System.out.print("Informe o valor do carro: R$ ");
                    double valorCarro = sc.nextDouble();

                    if (valorCarro < 0) {
                        System.out.println("Valor do carro não pode ser negativo.");
                    } else {
                        valorCarroValido = true;
                    }
                    totalValorCarros = totalValorCarros + valorCarro;
                } catch (Exception ex) {
                    System.out.println("Valor digitado não é válido.");
                }
            }
            while (anoCarroValido == false) {
                try {
                    System.out.print("Informe o ano do carro: ");
                    anoCarro = sc.nextInt();

                    if (anoCarro < 1870) {
                        anoCarroValido = false;
                        System.out.println("Ano digitado não é válido");
                    } else {
                        anoCarroValido = true;
                    }
                    totalAnoCarros = totalAnoCarros + anoCarro;
                } catch (Exception ex) {
                    System.out.println("Ano informado não é válido");
                }
            }
        }
        int mediaAnosCarros = totalAnoCarros / quantidadeCarros;
        double mediaValorCarros = totalValorCarros / quantidadeCarros;

        System.out.println("Quantidade de carros cadastrados: " + quantidadeCarros +
                "\nQuantidade de carros que começam com G: " + carrosComecaComG +
                "\nQuantidade de carros que começam com A: " + carrosComecaComA +
                "\n    " +
                "\nMedia do valor dos carros é de: R$ " + mediaValorCarros +
                "\nMedia do ano dos carros é de: " + mediaAnosCarros);

        // Exercício 02
        boolean numeroValido = false;
        int numero = 0;

        while (numeroValido == false) {
            try {
                System.out.print("Informe um número para ser apresentado a tabuada do mesmo: ");
                numero = sc.nextInt();
                numeroValido = true;
            } catch (Exception ex) {
                System.out.println("Número inválido, digite novamente");
            }
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        // Exercício 03
        String antecessoresFinal = "", sucessoresFinal = "";
        int numero2 = 0;
        boolean numeroValido2 = false;

        while (numeroValido2 == false) {
            try {
                System.out.print("Informe um número: ");
                numero2 = sc.nextInt();
                numeroValido2 = true;
            } catch (Exception ex) {
                System.out.println("Valor inválido");
            }

            int antecessores = numero2;
            int sucessores = numero2;

            for (int i = 0; i <= 50; i++){
                antecessores--;
                sucessores++;
                if (antecessores % 2 == 0){
                    antecessoresFinal = antecessoresFinal + antecessores + ", ";
                } else if (sucessores % 2 != 0) {
                    sucessoresFinal = sucessoresFinal + sucessores + ", ";
                }
            }
            System.out.println("Os sucessores ímpares são: " + sucessoresFinal);
            System.out.println("Os antecessores pares são: " + antecessoresFinal);
        }
    }
}