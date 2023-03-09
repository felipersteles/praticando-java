package app;

import java.util.Scanner;
import entities.Dolar;

// ao rodar a aplicação pela primeira vez basta apertar ctrl+shift+f10
public class Main {
    public static void main (String [] args) {
        System.out.println("Calcular valor do dólar\n");

        Scanner input = new Scanner(System.in);

        Dolar dolar;
        System.out.printf("What is the dollar price?\n$ ");
        double value = input.nextDouble();

        dolar = new Dolar(value);

        System.out.printf("How many dollars will be bought?\n$ ");
        double quantity = input.nextDouble();

        System.out.println();
        dolar.buy(quantity);


        System.out.println(dolar.show());
    }
}
