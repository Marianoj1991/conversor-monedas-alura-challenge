import AlluraChallenge.modelos.BuscadorDeMonedas;
import AlluraChallenge.modelos.Resultados;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);
        Resultados resultados = new Resultados();
        int opcion = -1;
            System.out.println("Ingrese la operación que desea realizar:");
            System.out.println("""
                1) Dolar ===> Peso Argentino
                2) Peso Argentino ===> Dólar
                3) Dólar ===> Real Brasilero
                4) Real Brasilero ===> Dólar
                5) Dólar ===> Peso Colombiano
                6) Peso Colombiano ===> Dólar
                7) Salir
                """);
        while (opcion != 7) {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                if (opcion >= 1 && opcion < 7) {
                    resultados.resultados(opcion);
                } else if (opcion == 7) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número entre 1 y 7.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
            System.out.println("""
                        1) Dolar ===> Peso Argentino
                        2) Peso Argentino ===> Dólar
                        3) Dólar ===> Real Brasilero
                        4) Real Brasilero ===> Dólar
                        5) Dólar ===> Peso Colombiano
                        6) Peso Colombiano ===> Dólar
                        7) Salir
                        """);
        }

        System.out.println("Gracias por confiar en nosotros!");

    }
}
