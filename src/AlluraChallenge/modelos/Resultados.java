package AlluraChallenge.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class Resultados {

    BuscadorDeMonedas buscadorDeMonedas = new BuscadorDeMonedas();
    Gson gson = new Gson();
    Scanner scanner = new Scanner(System.in);

    public void resultados (int opcion) {
        switch (opcion) {
            case 1: {
                System.out.println("Ingrese el valor en dólares que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("USD");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.ARS()) + " [ARS]");
                break;
            }
            case 2: {
                System.out.println("Ingrese el valor en pesos argentinos que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("ARS");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [ARS] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.USD()) + " [USD]");
                break;
            }
            case 3: {
                System.out.println("Ingrese el valor en dólares que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("USD");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.BRL()) + " [BRL]");
                break;
            }
            case 4: {
                System.out.println("Ingrese el valor en reales que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("BRL");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [BRL] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.USD()) + " [USD]");
                break;
            }
            case 5: {
                System.out.println("Ingrese el valor en dólares que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("USD");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [USD] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.USD()) + " [COP]");
                break;
            }
            case 6: {
                System.out.println("Ingrese el valor en pesos colombianos que desea convertir:");
                double valor = Double.valueOf(scanner.nextLine());
                JsonObject usdValores = buscadorDeMonedas.getMoneyValues("COP");
                ValoresMonedas valoresMonedas = gson.fromJson(usdValores, ValoresMonedas.class);
                System.out.println(valoresMonedas);
                System.out.println("El valor " + valor + " [COP] corresponde al valor final de " + valor * Double.valueOf(valoresMonedas.USD()) + " [USD]");
                break;
            }
        }
    }
}
