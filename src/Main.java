import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Ainda é uma criança");
        } else if (idade > 12 && idade <= 21) {
            System.out.println("É um adolescente");
        } else if (idade > 21 && idade <= 60) {
            System.out.println("É um adulto");
        } else {
            System.out.println("Idoso");
        }

        int i = 10;
        while (i > 0) {
            System.out.println(i);
            --i;
        }


        int a = 7 + 3;
        System.out.println("7 + 3 = " + a);

        int b = +3;
        System.out.println("1, 2, " + b);

        int c = -3;
        System.out.println("-1, -2, " + c);


        // pré incremento
        int d = 8;
        System.out.println("1, 2, 3, 4, 5, 6, 7, " + d);
        int e = ++d;
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, " + e);


        // while
        int contador = 0;
        while (contador < 5) {
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if ((numero % 2) == 0) {
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }
            contador++;
        }


        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite os metros quadrados do terreno: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("Área = %.2f%n", area);
        System.out.printf("Preço = %.2f%n", preco);
        sc.close();


        int q = 2;
        int r = 20;
        System.out.println("Olá");
        while (q < r) {
            System.out.println(q + " - " + r);
            q = q + 2;
            r = r - 1;
        }


        // For
        int u = 8;
        int v = 3;
        int w = 0;
        for (i = 0; v < u; w++) {
            u -= 1;
            v += 1;
            System.out.println(w);
        }
    }
}