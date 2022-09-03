package com.company;

import java.util.Scanner;

public class tp_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int) ((Math.random() * 100) + 1);
        int numeroUsuario, i;

        System.out.println("¡Hola! adivina el numero, ingresalo: ");
        numeroUsuario = sc.nextInt();
        do {
            System.out.println("Nop! Ingresalo de nuevo: ");
            numeroUsuario = sc.nextInt();
            if (numeroAleatorio > numeroUsuario) {
                System.out.println("Casi, pero es mayor que " + numeroUsuario);
            } else if (numeroAleatorio < numeroUsuario) {
                System.out.println("Casi, pero es menor que " + numeroUsuario);
            }
        } while (numeroAleatorio != numeroUsuario);
        {
            if (numeroAleatorio == numeroUsuario) {
                System.out.println("¡¡¡ ADIVINASTE !!!");
            }
        }
    }
}