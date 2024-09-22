package br.edu.ifsp.exercicio;

import java.util.Scanner;

public class ExTemperaturaSemana {

    public static String quantosDiasSemanaTempAcimaMedia(int[] listaTemp) {
        if (listaTemp.length != 7) {
            return "Erro";
        }

        int somaTemperaturas = 0;
        for (int temp : listaTemp) {
            somaTemperaturas += temp;
        }

        double mediaTemperatura = somaTemperaturas / 7.0;

        int diasAcimaMedia = 0;
        for (int temp : listaTemp) {
            if (temp > mediaTemperatura) {
                diasAcimaMedia++;
            }
        }

        return String.valueOf(diasAcimaMedia);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            String[] valores = input.split(" ");
            int[] temperaturas = new int[7];
            for (int i = 0; i < 7; i++) {
                temperaturas[i] = Integer.parseInt(valores[i]);
            }

            System.out.println(quantosDiasSemanaTempAcimaMedia(temperaturas));
        } catch (Exception e) {
            System.out.println("Erro");
        } finally {
            scanner.close();
        }
    }
}
