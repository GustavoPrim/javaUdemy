import java.util.Scanner;

public class ListaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora = 23;
        while (hora >= 0){
            int minutos = 59;
            while (minutos >= 0){
                int segundos = 59;
                while(segundos >= 0){
                    System.out.println(hora + ":" + minutos + ":" + segundos);
                    segundos -= 1;
                }
                minutos -= 1;
            }
            hora -= 1;
        }
    }
}