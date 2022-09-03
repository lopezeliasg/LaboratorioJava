package com.company;

import java.util.Scanner;

public class tp_9 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Integer pesoCalculo;
        System.out.println("-- Indique genero -- ");System.out.println("1 - Femenino");System.out.println("2 - Masculino");
        System.out.println("Opcion: ");
        Integer opcion = sc.nextInt();
        if (opcion != 1 && opcion != 2)
        {
            System.out.println("ERROR: ingrese 1 o 2 segun el genero");
        }
        if (opcion == 1)
        {
            System.out.println("Opcion: Femenino");
            System.out.println("Ingrese altura: ");
            Integer altura = sc.nextInt();
            pesoCalculo = altura - 110; System.out.println("Peso ideal: "+pesoCalculo+"kg - segun el genero y la altura dada");
        }
        if (opcion == 2)
        {
            System.out.println("Opcion: Masculino");
            System.out.println("Ingrese altura: ");
            Integer altura = sc.nextInt();
            pesoCalculo = altura - 120; System.out.println("Peso ideal: "+pesoCalculo+"kg - segun el genero y la altura dada");
        }

    }
}
