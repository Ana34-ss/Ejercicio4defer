package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        // Primero, creé un Scanner para poder leer lo que escriben los jugadores por consola.
        Scanner s = new Scanner(System.in);

        // Le pedí al jugador 1 que ingrese su jugada y la guardé en una variable.
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase(); // Convertí a minúsculas para evitar problemas con mayúsculas.

        // Igual hice con el jugador 2.
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();

        // Para comparar las jugadas, usé .equals() porque en Java no se comparan cadenas con '=='.
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            // Por defecto supuse que gana el jugador 2.
            int ganador = 2;

            // Evalué la jugada del jugador 1 con un switch para decidir si gana él.
            switch (j1) {
                case "piedra":
                    // Si el jugador 2 eligió tijeras, gana el 1.
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;

                case "papel":
                    // Si el jugador 2 eligió piedra, gana el 1.
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;

                case "tijeras":
                    // Si el jugador 2 eligió papel, gana el 1.
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
                    break;

                default:
                    // Si el jugador 1 escribió algo que no entendí, aviso y termino el programa.
                    System.out.println("Entrada inválida del jugador 1");
                    s.close();
                    return;
            }

            // Finalmente, muestro quién ganó.
            System.out.println("Gana el jugador " + ganador);
        }

        // Cierro el Scanner para evitar problemas.
        s.close();
    }
}
