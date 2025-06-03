package com.converter.menu;

import com.converter.models.CurrencyConvertedModel;
import com.converter.services.CurrencyConverter;
import com.converter.services.CurrencyConverterImpl;

import java.util.Scanner;

public class Menu {
    private final CurrencyConverter converter = new CurrencyConverterImpl();
    private final Scanner scanner = new Scanner(System.in);
    public void exibirMenu() {
        int opcion;

        do {
            System.out.println("""
                    ********************************************
                    Sea bienvenido/a al Conversor de Moneda =]

                    1) Dólar => Peso argentino
                    2) Peso argentino => Dólar
                    3) Dólar => Real brasileño
                    4) Real brasileño => Dólar
                    5) Dólar => Peso colombiano
                    6) Peso colombiano => Dólar
                    7) Salir
                    Elija una opción válida:
                    ********************************************
                    """);

            opcion = validateNumber();

            switch (opcion) {
                case 1 -> doConvert("USD", "ARS");
                case 2 -> doConvert("ARS", "USD");
                case 3 -> doConvert("USD", "BRL");
                case 4 -> doConvert("BRL", "USD");
                case 5 -> doConvert("USD", "COP");
                case 6 -> doConvert("COP", "USD");
                case 7 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }

    private int validateNumber(){
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor ingresa un número: ");
            }
        }
    }
    private double validateDouble(){
        while (true) {
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, ingresa el monto: ");
            }
        }
    }

    private void doConvert(String base, String destiny) {
        System.out.print("Ingrese la cantidad a convertir: ");
        double amount = validateDouble();

        CurrencyConvertedModel conversion = converter.convert(base, destiny, amount);
        if (conversion.result() == -1.0) {
            System.out.println("❌ No se pudo realizar la conversión. Intenta de nuevo.\n");
        }else{
            System.out.printf("%.2f %s => %.2f %s%n", conversion.amount(), conversion.base(), conversion.result(), conversion.destiny());

        }


    }
}
